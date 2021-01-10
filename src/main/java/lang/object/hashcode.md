### 什么是hashcode？
hashcode就是一个int类型的整数。

在Object的默认本地方法实现中会为
每个不同的Object返回不同的hashcode。

### 为什么要有hashcode？
在还没有hash表的时候，所有对象都要放到一个list中，
比如一个list中放了这样一些对象 {姓名：年龄}


【{"张三":60},{"李四":50},{"王五":40}..】
假设这个list有10000个对象的话，要找到名字为name人的年龄
就需要遍历整个list，判断姓名是否为name,才能找到
对应的名字。这是非常慢的。

于是有了hash表，就是直接通过key得到整个对象的地址。
比如将张三的二进制数做特定规则变换，得到一个地址，
这样就可以直接通过一个key拿到地址，无需遍历整个list

### 存在的问题
但是通过以上方式存在一个明显的问题就是，无法保证所有object
的key通过fx变换后都能得到不同的value，毕竟hash表大小有限。
那么必然会有不同的对象散列到相同的地址上。
解决这个问题很简单，就是将每个地址指向一个链表，通过散列后再遍历
一个小的链表找到具体对象就快得多。

### 另外一些考虑
但是这样只是实现了让查找的速度变快了。两个对象之间经常做的操作
是判断是否相等，当要判断hash表中找到一个特定值的对象时，又需要
遍历所有对象

### 最终解决方案
为了解决以上问题，于是有了hashcode的相关约定，如下：

在 Java 应用程序执行期间，在同一对象上多次调用 hashCode 
方法时，必须一致地返回相同的整数，前提是对象上 equals 
比较中所用的信息没有被修改。从某一应用程序的一次执行到同一应用程序的另一次执行，该整数无需保持一致。   

如果根据 equals(Object) 方法，两个对象是相等的，那么
在两个对象中的每个对象上调用 hashCode 方法都必须生成相同
的整数结果。   

以 下情况不 是必需的：如果根据 equals(java.lang.object) 
方法，两个对象不相等，那么在两个对象中的任一对象上调 
用 hashCode 方法必定会生成不同的整数结果。但是，程序员
应该知道，为不相等的对象生成不同整数结果可以提高哈希表的性能。   
当equals方法被重写时，通常有必要重写 hashCode 方法，
以维护 hashCode 方法的常规协定，
该协定声明相等对象必须具有相等的哈希码。 
