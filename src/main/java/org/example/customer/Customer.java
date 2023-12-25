package org.example.customer;

public class Customer {

    public void order(String menuName, Menu menu, Cooking cooking) {
        // menuName에 해당하는 ManuItem을 선별할 수 있고,
        // 요리사에게 해당 menuItem에 대한 요리를 만들어 달라고 요청
        MenuItem menuItem = menu.choose(menuName);
        Cook cook = cooking.makeCook(menuItem);
    }
}
