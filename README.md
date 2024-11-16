## 入门
### 常见的CMD命令
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

### HelloWorld案例
```java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
    }
}
```

打开cmd，cd进入文件目录，输入编译命令javac HelloWorld.java，此时会生成HelloWorld.class文件，再输入执行命令java HelloWorld则可输出HelloWorld。

### 常见小问题
1. 注意标点符号都要为英文符号
2. 注意单词大小写例如String不能写为string

### Path环境变量的配置
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

### JDK和JRE
JDK是JAVA开发工具包包含：

    1. JVM虚拟机
    2. 核心类库
    3. 开发工具

JRE是JAVA的运行环境包含：

    1. JVM
    2. 核心类库
    3. 运行工具

JDK和JRE以及JVM的包含关系：

    1. JDK包含JRE
    2. JRE包含JVM

## 基础概念
### 注释和关键字
#### 注释
    1. 单行注释
        1. //注释信息
    2. 多行注释
        1. /*注释信息*/
    3. 文档注释
        1. /**注释信息*/

```java
//public是访问修饰符，表示这个类是公开的，可以被其他类访问
//class关键字，表示这是一个类定义
/*HelloWorld为类名，需要按照Java命名规范使用大托峰命名法
并且需要与文件名一直。合起来就是：定义一个公开的类，
类名为HelloWorld*/
public class HelloWorld{
    //叫做main方法，表示程序的主入口
    /*
    static表示是一个静态方法，可以直接通过类名调用，不需要创建对象，
    void表示这个方法不返回任何值，main为方法名，String[] args为命令行参数，
    表示以字符串数组的形式接收
    */
    public static void main(String[] args){
        /*输出语句
        会把小括号里面的信息输出到屏幕*/
        /*
        System.out表示java系统类，out是系统类的一个输出对象，
        println()输出方法；合起来就是调用系统类的输出对象里面的
        println方法
        */
        System.out.println("HelloWorld");
    }
}
```

#### 关键字
关键字就是被java赋予了特定意义的英文单词

    1. 关键字字母全部小写
    2. 在代码编辑器中常有特殊的颜色标记

class：用于创建或定义一个类，类是java最基本的组成单元

### 字面量(常量)
| 字面量类型 | 说明 | 举例 |
| --- | --- | --- |
| 整数类型 | 不带小数点的数字 | 666,888 |
| 小数类型 | 带小数点的数字 | 3.14 |
| 字符串类型 | 用双引号括起来的内容 | “HelloWorld” |
| 字符类型 | 用单引号引来的内容，只能有一个内容 | 'A'，'0','我' |
| 布尔类型 | 布尔值，表示真假 | 只有两个值：true，false |
| 空类型 | 一个特殊的值，空值 | 值是：null |


#### 字符类型的字面量
| \t | 制表符 | 输出的时候，把前面的字符串长度补齐到8，或者8的倍数，最少补一个空格，最多补8个空格 |
| --- | --- | --- |


### 变量
#### 变量的定义格式
数据类型 变量名=数据值;

数据类型：为空间中存储的数据，加入类型【限制】

```java
public class VariableDemo {
        public static void main(String[] args) {
                //定义变量
                //数据类型 变量名=数据值
                //数据类型：限定变量能存储数据的类型
                //int（整数） double（小数）
                //变量名：存储空间的名字
                //等号：把右边的数据赋值给左边的变量
                int a=10;
                System.out.println(a);
        }
}

```

#### 变量的使用方式和注意事项
```java
                //定义变量和输出变量
                int b=10;
                System.out.println(b);//10
                System.out.println(b);//10
                //参与计算
                int c=10;
                int d=10;
                System.out.println(c+d);//20
                //修改变量的值
                System.out.println(c);//10
                c=20;
                System.out.println(c);//20

```

**注意事项：**

1. 只能存储一个值
2. 变量名不允许重复定义
3. 一条语句可以定义多个变量
4. 变量在使用之前一定要进行赋值
5. 注意变量的作用域范围

```java
                //在一条语句中，可以定义多个变量
                int e=100,f=200,g=300;
                System.out.println(e);
                System.out.println("----------------");
                System.out.println(f);
                System.out.println("----------------");
                System.out.println(g);
                //变量在使用之前必须要赋值
                int h;
                System.out.println(h);//未赋值变量会报错
                int i=500;
                System.out.println(i);
```

#### 变量的练习
```java
public class VariableTest {
        //主入口
        public static void main(String[] args) {
                //一开始没有乘客
                int count=0;
                //第一站：上一位乘客
                //原有基础上+1
                count=count+1;
                //第二站：上去两位乘客，下来一位乘客
                count=count+2-1;
                //第三站：上去两位乘客，下来一位乘客
                count=count+2-1;
                //第四站：下来一位乘客
                count=count-1;
                //第五站：上去一位乘客
                count=count+1;
                //请问到了终点站车上一共几位乘客
                System.out.println(count);
        }
}

```

#### 计算机中的数据存储
**计算机的存储规则**

1. Text文本
    1. 数字
    2. 字母
    3. 汉字
2. Image图片
3. Sound声音

**在计算机中所有的数据都是以二进制的形式来存储的**

**常见的进制**

1. 二进制:由0和1组成
2. 八进制:由0-7组成
3. 十进制:由0-9组成
4. 十六进制:由0-9以及a-f组成

**不同进制在JAVA中的表示形式**

1. 二进制需要以0b开头
2. 十进制不需要任何前缀为默认
3. 八进制需要以0开头
4. 十六进制需要以0x开头

#### 数据类型
1. 基本数据类型
    1. 整数
        1. byte(内存占用**1**个字节)
        2. short(内存占用**2**个字节)
        3. int(内存占用**4**字节)
        4. long(内存占用**8**个字节)
            1. **定义long类型变量需要在数值的后面加一个L作为后缀,可大小写但建议大写**
    2. 浮点数
        1. float(内存占用**4**个字节)
            1. **定义float类型变量需要在数值的后面加一个F作为后缀,可大小写但建议大写**
        2. double(内存占用**8**个字节)
    3. 字符
        1. char(内存占用**2**个字节)
    4. 布尔
        1. boolean(内存占用**1**个字节)
    5. 字符串
        1. String
    6. 

```java
public class VariableDeom {
        public static void main(String[] args) {
            //byte的取值范围最小为-128--+127
                byte a=10;
                System.out.println(a);
                short b=20;
                System.out.println(b);
                int c=30;
                System.out.println(c);
                long d=40L;
                System.out.println(d);
                float e=50.1F;
                System.out.println(e);
                double f=60.2;
                System.out.println(f);
                char g='中';
                System.out.println(g);
                boolean h=false;
                System.out.println(h);
          //取值范围大小关系double>float>long>int>short>byte

        }
}

```

    7. 练习

```java

public class VariableTest {
        public static void main(String[] args) {
                /*
                姓名:黑马谢广坤
                年龄:18
                性别:男
                身高:180.1
                是否单身:是
                注意:long类型变量要加L后缀;float变量要加F后缀
                */
                //定义变量记录姓名
                String name="黑马谢广坤";
                //定义int记录年龄
                int age=18;
                //记录性别
                char gender='男';
                //身高
                double height=180.1;
                //是否单身true为是false为否
                boolean flag=true;
                //输出
                System.out.println(name);
                System.out.println(age);
                System.out.println(gender);
                System.out.println(height);
                System.out.println(flag);
        }
}

```

2. 引用数据类型(数组和面向对象后再来学习)

#### 标识符
标识符:就是给**类,方法,变量**等起的名字.

编写程序时应尽量遵守阿里巴巴编码规范

[阿里巴巴Java开发手册终极版v1.3.0.pdf](https://www.yuque.com/attachments/yuque/0/2024/pdf/40814874/1731396585218-80a8247f-39a6-40b9-a644-cd686c55cf28.pdf)

1. **标识符命名规则**
    1. 硬性要求
        1. 由数字,字母,下划线和美元符号组成
        2. 不能以数字开头
        3. 不能是关键字
        4. 区分大小写
    2. 软性建议
        1. 小驼峰命名法: 适用于**方法, 变量**
            1. 例:标识符是一个单词的时候全小写:name
            2. 例:由多个单词组成的第一个单词小写,其他单词首字母大写:firstName
        2. 大驼峰命名法: 适用于**类名**
            1. 例: 一个单词的时候,首字母大写:Student
            2. 多个单词时,每个首字母都要大写:GoodStudent

#### 键盘录入
**介绍: JAVA内置的一个类叫做Scanner, 这个类可以接收键盘输入的数字. **

**步骤:**

    1. 导包---Scanner这个类在哪
        1. import javautil.Scanner; 导包的动作必须出现在类定义的上方
    2. 创建对象---表示我要开始使用Scanner这个类了
        1. Scanner sc=new Scanner(System.in);
        2. 在上面的格式中,只有sc是变量名,可以变,其他的都不允许变
    3. 接收数据---真正开始干活了
        1. int i=sc.nextInt();
        2. 上面的给事中,只有i是变量名,可变,其他都不可变
    4. 例

```java
//导包
import java.util.Scanner;
public class ScnnerDemo {
        public static void main(String[] args) {
                //创建对象
                Scanner sc = new Scanner(System.in);

                System.out.println("请输入整数:");
                //接收数据
                //变量i记录了键盘录入的数据
                int i=sc.nextInt();
                System.out.println(i);

        }
}
```

    5. 练习

```java
//导包
import java.util.Scanner;
public class ScannerTest {
        public static void main(String[] args) {
                //创建对象
                Scanner sc = new Scanner(System.in);

                System.out.println("请输入第一个数字");
                int n = sc.nextInt();
                System.out.println("请输入第二个数字");
                int m = sc.nextInt();
                System.out.println("他们的和为："+(m+n));
        }
}
```

### IDEA
#### IDEA下载和安装（省略自行百度）
#### IDEA的第一个代码
    1. IDEA的项目结构 （从大到小）
        1. project（项目）
        2. module（模块）
        3. package（包）
        4. class（类）
    2. 创建项目
        1. 创建空项目
        2. 创建模块(每学习一个新学习点,可新建一个模块)
        3. 在模块的src文件夹中新建软件包(包名通常为公司域名的反写加作用例如,com.itheima.demo)
        4. 在软件包下新建类
        5. 输入psvm按tab即可快速生成程序主入口代码
        6. 输入sout按tab即可快速生成打印代码

#### 项目, 模块, 类的操作
    1. 类
        1. 新建
        2. 删除
        3. 修改(不可直接修改类名,需要右键类文件重命名)
    2. 模块
        1. 新建
            1. 右键项目结构,选择模块,选择加号
        2. 修改
        3. 删除
        4. 导入
    3. 项目
        1. 关闭
            1. 点击文件,选择关闭
        2. 新建
            1. 点击文件,选择新建空项目
        3. 打开
        4. 修改

## 运算符
#### 算术运算符
概念: 对字面量或者变量进行操作的符号

        1. +
            1. 加
        2. -
            1. 减
        3. *
            1. 乘
        4. /
            1. 除
        5. %
            1. 取余
        6. 例

```java
public class Main {
        public static void main(String[] args) {
                //+
                System.out.println(3+2);
                //-
                System.out.println(5-1);
                //*
                System.out.println(7*9);
                // /
                System.out.println(10/2);//5
                //
                System.out.println(10/3);//3
            
                //%
                System.out.println(5%2);

                //如果计算中有小数参与结果是有可能不精确的
                System.out.println(1.1*1.01);
                System.out.println(5.05 - 1.01);
                System.out.println(5.06+1.04);
        }
}
```

            1. 练习: 数值拆分

```java
//需求: 键盘录入一个三位数, 将其拆分为个位, 十位, 百位
package com.itheima.test;

import java.util.Scanner;

public class Test1 {
        public static void main(String[] args) {
                //需求: 键盘录入一个三位数, 将其拆分为个位, 十位, 百位

                //键盘录入
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个三位数");
                int number = sc.nextInt();

                //获取个位, 十位, 百位
                //公式
                /*
                * 个位: 数值%10
                * 十位: 数值/10%10
                * 百位: 数值/100%10
                * */
                int ge=number%10;
                int shi=number/10%10;
                int bai=number/100%10;
                System.out.println(ge);
                System.out.println(shi);
                System.out.println(bai);
        }
}

```

##### 隐式转换和强制转换
###### 隐式转换(自动类型提升)
概念: 把取值小的数值, 转成取值范围大的数据

```java
int a=10;
double b=a;
//a会被转为10.0, double取值范围比int要大
```

**隐式转换的两种提升规则**

                    1. 取值范围小的, 和取值范围大的进行运算, 小的会先提升为大的, 再进行运算
                    2. byte short char 三种类型的数据在运算的时候, 都会直接先提升为int, 再进行运算

```java
int a=10;
double b=12.3;
数据类型? c=a+b;
//由于double取值范围比int大, 所以a会先转为double进行运算, 所以c为double类型

byte a=10;
byte b=20;
数据类型? c=a+b;
//byte short char三种类型都会先提升为int类型,所以c为int型
```

###### 强制转换
概念: 如果把一个取值范围大的数值, 赋值给取值范围小的变量. 是不允许直接赋值. 如果一定要这么做就需要加入强制转换

**格式: 目标类型数据类型 变量名=(目标数据类型)被强转的数据;**

```java
package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo2 {
        public static void main(String[] args) {
                byte b1=10;
                byte b2=20;
                //表达式强转时要将整个表达式用括号括起来
                byte result=(byte)(b1+b2);
                System.out.println(result);

                byte c1=100;
                byte c2=100;

                byte resultc=(byte)(c1+c2);
                //会发生错误,因为转换的数值超过了变量类型的范围
                System.out.println(resultc);
        }
}

```



##### 表达式	
概念: 用运算符把字面量或者变量连接起来, 符合java语法的式子就可以称为表达式.; 不同运算符链接的表达式体现的是不同类型的表达式

**例**

```java
int a=10;
int b=20;
int c=a+b;
//+: 是运算符,并且为算术运算符
//a+b: 是表达式,由于+是算术运算符,所以这个表达式叫算术表达式
```

#### 字符串相加
##### 字符串"+"操作
**概念: 当"+"操作出现字符串时, 这个"+"是字符串连接符, 不再是算术运算符. 会将前后数据进行拼接, 并产生一个新的字符串.**

例子: "123"+123 结果为"123123"

**当连续进行"+"操作时, 从左到右逐个执行. **

1+99+"年黑马"  结果为"100年黑马"  

![](https://cdn.nlark.com/yuque/0/2024/png/40814874/1731631736927-8bd4751b-cf11-42b7-a8c2-961b5e664112.png)

##### 例题: 数值拆分
```java
import java.util.Scanner;

public class Test1 {
        public static void main(String[] args) {
                //需求: 键盘录入一个三位数, 将其拆分为个位, 十位, 百位

                //键盘录入
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个三位数");
                int number = sc.nextInt();

                //获取个位, 十位, 百位
                //公式
                /*
                * 个位: 数值%10
                * 十位: 数值/10%10
                * 百位: 数值/100%10
                * */
                int ge=number%10;
                int shi=number/10%10;
                int bai=number/100%10;
                System.out.println("个位是:"+ge);
                System.out.println("十位是:"+shi);
                System.out.println("百位是:"+bai);
        }
}
```

#### 字符相加
**当字符+字符/字符+数字时, 会把字符通过ASCII码表查询到对应数字再进行计算.**

```java
System.out.println(1+'a');//98
```

#### 自增自减运算符
##### 基本用法
| 符号 | 作用 | 说明 |
| --- | --- | --- |
| ++ | 加 | 变量的值加1 |
| -- | 减 | 变量的值减1 |


**注意事项: ++和--既可以放在变量前面也可以放在变量后面, ++和--无论在前在后,单独写一行结果是一样的.**

##### 两种用法
###### 先用后加
```java
int a=10;
int b=a++;//10
```

###### 先加后用
```java
int a=10;
int b=++a;//11
```

#### 赋值运算符
##### 分类
| 符号 | 作用 | 说明 |
| --- | --- | --- |
| = | 赋值 | int a=10; 将10赋值给a |
| += | 加后赋值 | a+=b;将a+b的值给a |
| -= | 减后赋值 | a-=b;将a+b的值给a |
| *= | 乘后赋值 | a*=b;将a*b的值给a |
| /= | 除后赋值 | a/=b;将a/b的商给a |
| %= | 取余后赋值 | a%=b;将a%b的余数给a |


**注意事项: 扩展的赋值运算符隐含了强制类型转换**

```java
package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo4 {
        public static void main(String[] args) {
                //+=
                //规则: 将左边和右边进行相加, 然后赋值给左边
                int a=10;
                int b=20;
                a+=b;
                //等同于a=(int)(a+b);
                System.out.println(a);
                System.out.println(b);

                //细节
                //+= -= *= /= %=都隐藏了一个强制转换
                //short在计算时会先转为int型再进行计算,根据左边的变量类型再把结果转换类型
                short s=1;
                //等同于s=(short)(s+1);
                s+=1;
                System.out.println(s);
        }
}

```

#### 关系运算符
| 符号 | 说明 |
| --- | --- |
| == | a==b, 判断a和b的值是否相等, 成立为true,否则false |
| != | a!=b, 判断a和b的值是否不相等, 成立为true,否则false |
| > | a>b, 判断a是否大于b,成立为true,否则false |
| >= | a>=b, 判断a是否大于等于b,成立为true,否则false |
| < | a<b, 判断a是否小于b,成立为true,否则false |
| <= | a<=b, 判断a是否小于等于b,成立为true,否则false |


**注意事项: 关系运算符的结果都是****<font style="color:#DF2A3F;">boolean</font>****类型, 要么true, 要么false. 且要注意不要把"=="写成"="**

```java
package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo5 {
        public static void main(String[] args) {
                //==
                int a = 10;
                int b = 10;
                int c = 20;
                System.out.println(a == b);
                System.out.println(a == c);

                //!=
                System.out.println(a != b);
                System.out.println(a != c);
        }
}
```

##### 练习
```java
package com.itheima.test;

import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {
                /*
                 * 你和你的约会对象在餐厅里面正在约会. 键盘输入两个整数, 表示你和你约会对象衣服的时髦成都.(手动录入0-10之间的整数, 不能录入其他)
                 * 如果你的时髦度大于你对象的时髦度, 相亲成功输出true, 否则false
                 */

                //创建输入对象
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你的时髦度:");

                //创建接收变量,并使用接收对象将接收的数据赋予变量
                int n = sc.nextInt();
                System.out.println("请输入你约会对象的时髦度:");
                int m = sc.nextInt();

                //创建布尔变量
                boolean a = n > m;
                System.out.println(a);
                
        }
}

package com.itheima.test;

import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {
                /*
                 * 你和你的约会对象在餐厅里面正在约会. 键盘输入两个整数, 表示你和你约会对象衣服的时髦成都.(手动录入0-10之间的整数, 不能录入其他)
                 * 如果你的时髦度大于你对象的时髦度, 相亲成功输出true, 否则false
                 */

                //创建输入对象
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你的时髦度:");

                //创建接收变量,并使用接收对象将接收的数据赋予变量
                int n = sc.nextInt();
                System.out.println("请输入你约会对象的时髦度:");
                int m = sc.nextInt();

                //创建布尔变量
                boolean a = n > m;
                System.out.println(a);
                
        }
}


```

#### 逻辑运算符
在数学中, 一个数据x, 大于5, 小于15, 我们可以这样来表示: 5<x<15.

再java中, 需要把上面的式子先进行拆解, 再进行合并表达

**拆解为: x>5 和 x<15**

**合并为: x>5&x<15**

| 符号 | 作用 | 说明 |
| --- | --- | --- |
| & | 逻辑与 | 并且, 两边都为真,结果为真 |
| | | 逻辑或 | 或者, 两边都为假,结果为假 |
| ^ | 逻辑异或 | 相同为false, 不同为true |
| ! | 逻辑非 | 取反 |


```java
package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo6 {
        public static void main(String[] args) {
                //& 并且
                //两边都为真, 结果为真
                System.out.println(true & true);
                System.out.println(false & false);
                System.out.println(true & false);
                System.out.println(false & true);

                System.out.println("-----------------");

                //| 或者
                //两边都为假, 结果为假
                System.out.println(true | true);
                System.out.println(false | false);
                System.out.println(true | false);
                System.out.println(false | true);

                System.out.println("-----------------");

                //^ 异或
                //相同为假, 不同为真
                System.out.println(true ^ true);
                System.out.println(false ^ false);
                System.out.println(true ^ false);
                System.out.println(false ^ true);

                System.out.println("-----------------");

                //! 非(取反)
                //注意取反感叹号不要写多次
                System.out.println(!false);
                System.out.println(!true);
        }
}

```

#### 短路运算符
| 符号 | 作用 | 说明 |
| --- | --- | --- |
| && | 短路与 | 结果和&相同,但是有短路效果 |
| || | 短路或 | 结果和|相同,但是有短路效果 |


```java
package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo7 {
        public static void main(String[] args) {
                //&& 短路与
                //运行结果和&是一样的
                //表示两边都为真, 结果才为真
                System.out.println(true && true);
                System.out.println(false && false);
                System.out.println(false && true);
                System.out.println(true && false);

                System.out.println("----------");

                //||短路或
                //运行结果和|是一样的
                //表示两边都为假, 结果才为假
                System.out.println(true || true);
                System.out.println(false || false);
                System.out.println(false || true);
                System.out.println(true || false);

                //短路逻辑运算符具有短路效果
                //当左边表达式可以确定结果时,右边就不会参与运行
                int a = 10;
                int b = 10;
                boolean c = ++a < 5 && ++b < 5;
                System.out.println(c);//false
                System.out.println(a);//11
                System.out.println(b);//10(++b没有被执行)
        }
}

```

**注意事项:**

**& | ,无论左边true false, 右边都要执行**

**&& ||, 如果左边能确定整个表达式的结果, ****<font style="color:#DF2A3F;">右边不执行</font>**

**&&: 左边为false, 右边不论真假, 整体都为false**

**||: 左边为true, 右边不论真假, 整体都为true**

```java
package com.itheima.test;

import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
                /*
                 * 数字6是一个真正伟大的数字, 键盘录入两个整数
                 * 如果其中一个为6, 最终结果输出true
                 * 如果他们的和为6的倍数,最终结果输出true
                 * 其他情况都为false
                 * */

                //提示
                System.out.println("请输入两个整数:");
                //创建输入对象
                Scanner sc = new Scanner(System.in);

                //键盘输入两个整数
                int a = sc.nextInt();
                int b = sc.nextInt();


                //为真的情况a==6 b==6 (a+b)%6==0
                //进行短路逻辑运算符连接三个判断
                boolean result = (a + b) % 6 == 0 || a == 6 || b == 6;
                System.out.println(result);
        }
}

```

#### 三元运算符
**格式: 关系表达式?表达式1: 表达式2;**

**计算规则:**

1. **首先计算表达式的值**
2. **如果为true,表达式1的值就是运行结果**
3. **如果false,表达式2的值就是运行结果**

**例: 求两个数的较大值**

**a > b ? a : b;**

```java
package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo8 {
        public static void main(String[] args) {
                //使用三元运算符, 获取两个数的最大值

                //定义两个变量记录两个整数
                int a = 10;
                int b = 20;

                //使用三元运算符获取两个整数的较大值
                //格式: a>b?a:b
                //三元运算符的结果必须使用,否则会报错
                int max = a > b ? a : b;
                System.out.println(max);
                System.out.println(a > b ? a : b);
        }
}

```

```java
package com.itheima.test;

import java.util.Scanner;

public class Test4 {
        public static void main(String[] args) {
                /*
                 * 动物园里有两只老虎, 体重分别为通过键盘录入获得,
                 * 请用程序实现判断两只老虎的体重是否相同
                 * */

                //创建输入对象
                Scanner sc = new Scanner(System.in);
            
                System.out.println("请输入两只老虎的体重:");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println(n == m ? "相同" : "不同");
        }
}
```

```java
package com.itheima.test;

public class Test5 {
        public static void main(String[] args) {
                /*
                 * 一座寺庙里住着三个和尚, 已知他们的身高分别为150cm, 210cm, 165cm
                 * 请用程序实现获取这三个和尚的最高身高
                 * */

                //定义三个变量记录三个身高
                int height1 = 150;
                int height2 = 165;
                int height3 = 210;

                //将第一个和尚和第二个和尚进行比较
                //再拿结果跟第三个和尚比较
                int temp = height1 > height2 ? height1 : height2;
                int max = temp > height3 ? temp : height3;
                System.out.println(max);


        }
}
```

#### 运算符优先级
![](https://cdn.nlark.com/yuque/0/2024/png/40814874/1731721383159-e800eaa5-26ce-48a1-9aac-5c08c2037de1.png)

***小括号优先于所有**





