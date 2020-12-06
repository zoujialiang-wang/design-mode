/**
 * @auther zoujialiang
 * @date 2020/12/6 12:52
 * <p>
 * 简单工厂模式
 * 缺点
 * 1.客户必须记住工厂中常量和具体产品的映射关系。
 * 2.一旦产品品种体量增大到一定程度，工厂类将变得非常臃肿。
 * 3.最致命的缺陷，增加产品时，就要修改工厂类。违反开闭原则。
 */
public class EasyFactory {

    /*===============服务端======================*/
    interface Food {
        void eat();
    }

    static class Spaghetti implements Food {
        @Override
        public void eat() {
            System.out.println("吃西餐面条。。。。。");
        }
    }

    static class FoodFactory {
        public Food getFood(int num) {
            Food food = null;
            switch (num) {
                case 1:
                    food = new Spaghetti();
            }
            return food;
        }
    }

    /*=================客户端===================*/
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food food01 = foodFactory.getFood(1);
        food01.eat();
    }
}

