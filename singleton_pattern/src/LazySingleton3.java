/**
 * @auther zoujialiang
 * @date 2020/12/6 12:08
 * 懒汉式（线程安全）
 * 优点 1.实现了懒加载机制  2.线程安全
 * 缺点 1.无
 */
class LazySingleton3 {
    private static volatile LazySingleton3 instance;

    private LazySingleton3() {
    }

    /**
     * 当使用该方法时 ， 才创建对象
     * 第一次判断防止重复加锁
     * 第二次判断防止在多线程下出现问题
     *
     * @return
     */
    public static synchronized LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}