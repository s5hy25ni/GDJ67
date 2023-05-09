package com.min.edu.restricting;

// Banana 클래스는 상위 부모 클래스(Fruit)에서 
// permits 하지 않았기 때문에 사용이 불가능하다.
// 사용하려면
// public sealed interface Fruit permits Orange, Lemon 마지막에
// Banana 클래스를 추가해줘야 한다.
//public final class Banana implements Fruit{
//
//}
