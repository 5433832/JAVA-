<h2 id="gryWl">入门</h2>
<h3 id="CEGoi">常见的CMD命令</h3>
1. 盘符名称+冒号

说明：盘符切换

举例：E:回车，表示切换到E盘

2. dir

说明：查看当前路径下的内容（同时会显示隐藏内容）

3. cd目录

说明：进入单级目录

举例：cd itheima

4. cd ..

说明：回退上一级目录

5. cd 目录1\目录2\...

说明：进入多级目录

举例：cd itheima\JavaSE

6. cd \

说明：回退到盘符目录

7. cls

说明：清屏

8. exit

说明：退出命令提示框

<h3 id="y4t4M">HelloWorld案例</h3>
```java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
    }
}
```

打开cmd，cd进入文件目录，输入编译命令javac HelloWorld.java，此时会生成HelloWorld.class文件，再输入执行命令java HelloWorld则可输出HelloWorld。

<h3 id="ZOisk">常见小问题</h3>
1. 注意标点符号都要为英文符号
2. 注意单词大小写例如String不能写为string

<h3 id="OTyVZ">Path环境变量的配置</h3>
**右击我的电脑-属性-高级系统设置-环境变量**

步骤：

    1. 先配置JAVA_HOME。（E:\develop\jdk）
    2. 再配置Path。（%JAVA_HOME%\bin）

**额外扩展**

部分win10的电脑有一个bug

当你重启之后，配置的环境变量会失效

**解决方案**

    1. JAVA_HOME照样配置
    2. 在Path中，不要引用JAVA_HOME，直接填写完整路径（E:\develop\jdk\bin）

