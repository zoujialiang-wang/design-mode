/**
 * @auther zoujialiang
 * @date 2020/12/6 12:05
 * 懒汉式（线程安全）
 * 优点 1.实现了懒加载机制
 * 缺点 1.效率太低
 */
class LazySingleton2 {
    private static LazySingleton2 instance;

    private LazySingleton2() {
    }

    //当使用该方法时 ， 才创建对象
    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}