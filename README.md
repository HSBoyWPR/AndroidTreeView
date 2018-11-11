# AndroidTreeView
Android的树控件，以ListView作为基础进行封装

*预览结果
![](https://github.com/HSBoyWPR/SupportServer/blob/master/tv.png)


在布局中添加已经封装好的treeview控件
 ```xml
 <com.wpr.treeviewcore.TreeViewControl
                android:id="@+id/tree"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                />
```
创建树需要的节点数据
```java

  TreeNode node = new TreeNode();
        node.setName("P1");
        TreeNode node2 = new TreeNode();
        node2.setName("P2");
        TreeNode node3 = new TreeNode();
        node3.setName("P3");
        TreeNode node4 = new TreeNode();
        node4.setName("P4");
        node4.setExpand(false);
        TreeNode node5 = new TreeNode();
        node5.setName("P5");
        TreeNode node6 = new TreeNode();
        node6.setName("P6");
        TreeNode node7 = new TreeNode();
        node7.setName("P7");

        node.getNodes().add(node2);
        node.getNodes().add(node3);
        node.getNodes().add(node6);
        node2.getNodes().add(node4);
        node3.getNodes().add(node5);
        node5.getNodes().add(node7);
        treeViewControl = findViewById(R.id.tree);
        //绑定数据
        treeViewControl.setTreeData(node,true);

```
有关树的各种事件均通过
`treeViewControl.setTreeViewSetting(TreeViewSetting setting)`方法进行配置
* 目前还不完善
   1.树的级联勾选没实现
   2.关于树的部分事件未有对外发布
    3. ...
