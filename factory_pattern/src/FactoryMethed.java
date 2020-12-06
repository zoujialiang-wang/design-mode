/**
 * @auther zoujialiang
 * @date 2020/12/6 14:48
 * 缺点 ：代码臃肿
 */
public class FactoryMethed {
    /*===============服务端======================*/
    //-----------------------产品--------------------
    interface Food {
        void eat();
    }

    static class Spaghetti implements Food {
        @Override
        public void eat() {
            System.out.println("吃西餐面条。。。。。");
        }
    }

    //新增产品
    static class Rice implements Food {
        @Override
        public void eat() {
            System.out.println("吃米饭。。。。。");
        }
    }

    //--------------------------工厂-----------------------
    interface FoodFactory {
        Food getFood();
    }

    static class SpaghettiFactory implements FoodFactory {

        @Override
        public Food getFood() {
            return new Spaghetti();
        }
    }

    //新增产品工厂
    static class RiceFactory implements FoodFactory {

        @Override
        public Food getFood() {
            return new Rice();
        }
    }

    /*=================客户端===================*/
    public static void main(String[] args) {
        FoodFactory foodFactory = new SpaghettiFactory();
        Food food01 = foodFactory.getFood();
        food01.eat();
    }
}
