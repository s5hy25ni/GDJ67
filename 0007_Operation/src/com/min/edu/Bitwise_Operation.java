package com.min.edu;

public class Bitwise_Operation {
	public void bitwise() {
		byte b = 5 & 4; // 101&100 -> 100 -> 4 ( and : 둘 다 true면 true(1) )
		b = 5 | 4; // 101 | 100 -> 101 -> 5 ( or : 하나라도 true면 true )
		b = 5 ^ 4; // 101 ^ 100 -> 1 ( xor : 다르면 true, 같으면 false(0))
		b = 4 << 1; // 100 << 1 -> 1000 -> 8 ( shift : 부호비트는 빼고 왼쪽으로 1칸 이동 ) 
		b = 4 >> 1; // 100 >> 1 -> 10 -> 2 ( shift : 부호비트는 빼고 오른쪽으로 1칸 이동 ) 
		b = 4 >>> 1; // 100 >>> 1 -> 10 -> 2 ( zero-fill shift : 부호비트를 포함하여 이동 )
		b = ~4; // ~00000100 -> 11111011 -> -5 ( invert )
		
	}
}
