package com.wpr.treeviewcore;

import android.content.Context;
import android.widget.ListView;

import com.wpr.treeviewcore.model.TreeNode;

/**
 * Created by 丕汝 on 2018/10/23. 此类不再使用
 */

public class TreeView {
    private TreeViewAdapt treeViewAdapt;
    private ListView listView;
    private TreeViewSetting setting;


    public TreeView(Context context, TreeNode node, ListView listView) {
        treeViewAdapt = new TreeViewAdapt(context, node, listView);
        this.listView = listView;
    }

    /**
     * 设置树的参数，如需使用，必须在初始化前赋值
     *
     * @param setting
     */
    public void setTreeViewSetting(TreeViewSetting setting) {
        this.setting = setting;

        //添加配置
        if (setting != null) {
            if (setting.getOnTreeViewCheckBoxChangeListener() != null) {
                treeViewAdapt.setOnTreeViewCheckBoxChangeListener(setting.getOnTreeViewCheckBoxChangeListener());
            }
            if (setting.getOnItemLongClickListener() != null) {
                treeViewAdapt.setOnItemLongClickListener(setting.getOnItemLongClickListener());
            }

            if (setting.getOnItemClickListener() != null) {
                treeViewAdapt.setOnItemClickListener(setting.getOnItemClickListener());
            }
        }
    }

    /**
     * 初始化树控件
     *
     * @param isRefsh true每次初始化都重新获取数据
     */
    public void InitTreeView(boolean isRefsh) {
        listView.setAdapter(treeViewAdapt);
    }
}
