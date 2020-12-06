/**
 * @auther zoujialiang
 * @date 2020/12/6 12:17
 *
 * 静态内部类
 * 优点 1.懒加载 2.线程安全
 * 缺点 无
 */
class StaticInnerClass {
    private StaticInnerClass() {
    }

    private static class SingletonInstance {
        private static final StaticInnerClass INNER_CLASS = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return SingletonInstance.INNER_CLASS;
    }
}
