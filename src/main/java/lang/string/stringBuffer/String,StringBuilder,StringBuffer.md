# String
1：不可变，每次改变都会创建新的String  
2：可以缓存hashcode。**因为String不可变。**     
3：只有第一次获取hashcode需要计算，之后都很快，所以常常
作为HashMap的key   

### StringBuilder 和 StringBuffer
相同点：     
1：都没有重写hashcode，用的Object类的  
2：它们都能转换为String，为String服务   

不同点：    
1：StringBuilder线程不安全，StringBuffer线程安全   
2：StringBuffer使用了toStringCache缓存，StringBuilder没有

### 三者速度比较
String + ，和StringBuffer StringBuilder的append操作符
    
    StringBuilder>StringBuffer>String

原因为：StringBuilder和StringBuffer都继承了AbstractStringBuilder。
都用了扩容机制，所以频繁做字符串的相加操作时，不会频繁分配内存。    
因为扩容一次的内存可能能够使用很久。
