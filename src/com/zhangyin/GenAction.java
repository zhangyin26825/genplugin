package com.zhangyin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class GenAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Project project = e.getData(PlatformDataKeys.PROJECT);

        System.out.println("显示对话框");

        String name = Messages.showInputDialog("Hello", "你是谁", Messages.getQuestionIcon());
        System.out.println("输入的名字是"+name);

    }
}
