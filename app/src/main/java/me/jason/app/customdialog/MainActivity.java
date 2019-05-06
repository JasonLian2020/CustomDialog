package me.jason.app.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;
import me.jason.customdialog.CustomDialog;

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
                        .title("这是一个标题")
                        .content("请输入你的手机")
                        .negativeText("取消")
                        .positiveText("确定")
                        .dialogType(CustomDialog.DIALOG_TYPE_INPUT)
                        .show();
                break;
            case R2.id.btnImage:
                new CustomDialog.Builder(this)
                        .title("这是一个标题")
                        .content("图片")
                        .negativeText("取消")
                        .positiveText("确定")
                        .dialogType(CustomDialog.DIALOG_TYPE_IMAGE)
                        .show();
                break;
            case R2.id.btnMessage:
                new CustomDialog.Builder(this)
                        .title("这是一个标题")
                        .content("内容内容内容")
                        .negativeText("取消")
                        .positiveText("确定")
                        .dialogType(CustomDialog.DIALOG_TYPE_MESSAGE)
                        .show();
                break;
            case R2.id.btnSingleChoice:
                String[] denyReasons = new String[]{"该类型课程不支持退款", "课程已开始不支持退款", "其他"};
                new CustomDialog.Builder(this)
                        .title("拒绝退款")
                        .items(denyReasons)
                        .itemsCallbackSingleChoice(0, (dialog, itemView, which, text) -> false)
                        .negativeText("取消")
                        .positiveText("确定")
                        .onPositive((dialog, dialogAction) -> {
                            Toast.makeText(this, dialog.getSingleChoiceText(), Toast.LENGTH_SHORT).show();
                        })
                        .needInput(true)
                        .dialogType(CustomDialog.DIALOG_TYPE_SINGLE_CHOICE)
                        .show();
                break;
            case R2.id.btnMultiChoice:
                String[] items = new String[]{"1", "2", "3", "4", "5"};
                new CustomDialog.Builder(this)
                        .title("多选框")
                        .items(items)
                        .itemsCallbackMultiChoice(new Integer[]{0, 1}, (dialog, which, text) -> false)
                        .negativeText("取消")
                        .positiveText("确定")
                        .onPositive((dialog, dialogAction) -> {
                            String[] multiChoiceTexts = dialog.getMultiChoiceTexts();
                            if (multiChoiceTexts == null) return;
                            String content = "";
                            for (int i = 0; i < multiChoiceTexts.length; i++) {
                                String multiChoiceText = multiChoiceTexts[i];
                                if (i == 0) {
                                    content = content + multiChoiceText;
                                } else if (i == multiChoiceTexts.length - 1) {
                                    content = content + multiChoiceText;
                                } else {
                                    content = content + "\n" + multiChoiceText;
                                }
                            }
                            Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
                        })
                        .dialogType(CustomDialog.DIALOG_TYPE_MULTI_CHOICE)
                        .show();
                break;
        }
    }
}
