package com.example.wnsgu.myapplication;

/**
 * Created by wnsgu on 2017-08-04.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.kakao.auth.ErrorCode;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeResponseCallback;
import com.kakao.usermgmt.response.model.UserProfile;
import com.kakao.util.helper.log.Logger;


public class KakaoSignupActivity extends AppCompatActivity {
    /**
     * Main으로 넘길지 가입 페이지를 그릴지 판단하기 위해 me를 호출한다.
     * @param savedInstanceState 기존 session 정보가 저장된 객체
     */


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestMe();
    }

    /**
     * 사용자의 상태를 알아 보기 위해 me API 호출을 한다.
     */
    protected void requestMe() { //유저의 정보를 받아오는 함수

        UserManagement.requestMe(new MeResponseCallback() {
            @Override
            public void onFailure(ErrorResult errorResult) {
                String message = "failed to get user info. msg=" + errorResult;
                Logger.d(message);

                ErrorCode result = ErrorCode.valueOf(errorResult.getErrorCode());
                if (result == ErrorCode.CLIENT_ERROR_CODE) {
                    finish();
                    Toast.makeText(getApplicationContext(), "카카오톡 로그인 실패", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "카카오톡 로그인 실패", Toast.LENGTH_LONG).show();
                    redirectLoginActivity();
                }
            }

            @Override
            public void onSessionClosed(ErrorResult errorResult) {
                Toast.makeText(getApplicationContext(), "카카오톡 세션 닫힘", Toast.LENGTH_LONG).show();
                redirectLoginActivity();
            }

            @Override
            public void onNotSignedUp() {
                Toast.makeText(getApplicationContext(), "카카오톡 회원이 아님", Toast.LENGTH_LONG).show();
            } // 카카오톡 회원이 아닐 시 showSignup(); 호출해야함

            @Override
            public void onSuccess(UserProfile userProfile) {  //성공 시 userProfile 형태로 반환
                Logger.d("UserProfile : " + userProfile);
                Toast.makeText(getApplicationContext(), "카카오톡 로그인 성공", Toast.LENGTH_LONG).show();
                redirectActivity2();
            }

        });
    }

    private void redirectMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    protected void redirectLoginActivity() {
        final Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }

    protected void redirectImageActivity() {
        final Intent intent = new Intent(this, ImageClick.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }

    protected void redirectActivity2() {
        final Intent intent = new Intent(this, Activity2.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }
}


