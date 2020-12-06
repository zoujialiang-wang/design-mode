/**
 * @auther zoujialiang
 * @date 2020/12/6 11:30
 * <p>
 * 饿汉式（静态代码块）
 * 优点：1.类加载的时候就创建对象  2.避免了线程同步的问题
 * 缺点  1.没有懒加载的效果 会造成内存浪费
 */
class HungryType2 {
    //构造器私有化  防止外部能new
    private HungryType2() {

    }

    //本部内部创建对象实例
    private static HungryType2 instance;

    //在静态代码块创建对象
    static {
        instance = new HungryType2();
    }

    //提供你个公有的静态方法 ， 返回实例对象
    public static HungryType2 getInstance() {
        return instance;
    }
}