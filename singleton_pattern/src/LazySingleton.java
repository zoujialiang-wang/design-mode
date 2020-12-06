/**
 * @auther zoujialiang
 * @date 2020/12/6 12:00
 * 懒汉式（线程不安全）
 * 优点 1.实现了懒加载机制
 * 缺点 1.只能在单线程下应用
 */
class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    //当使用该方法时 ， 才创建对象
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
