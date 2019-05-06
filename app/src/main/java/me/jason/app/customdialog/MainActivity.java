package me.jason.app.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import me.jason.library.CustomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btnInput, R2.id.btnImage, R2.id.btnMessage, R2.id.btnSingleChoice, R2.id.btnMultiChoice})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R2.id.btnInput:
                new CustomDialog.Builder(this)
                        .title("title")
                        .content("hahaha")
                        .negativeText("取消")
                        .positiveText("确定")
                        .dialogType(CustomDialog.DIALOG_TYPE_INPUT)
                        .show();
                break;
            case R2.id.btnImage:
                break;
            case R2.id.btnMessage:
                break;
            case R2.id.btnSingleChoice:
                break;
            case R2.id.btnMultiChoice:
                break;
        }
    }
}
