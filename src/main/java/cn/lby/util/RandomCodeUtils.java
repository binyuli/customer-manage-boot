package cn.lby.util;

import java.util.Random;

public class RandomCodeUtils {
	
	public static String getRandomSixNumber()
	{
		Random random = new Random();
		String result = random.nextInt(1000000)+"";
		if(result.length() != 6)
		{
			return getRandomSixNumber();
		}
		return result;
	}
	
	public static int getRandomNumber(int num)
	{
		Random random = new Random();
		return random.nextInt(num);
	}
	
	public static void main(String[] args) {
		System.out.println(RandomCodeUtils.getRandomSixNumber());
		System.out.println(RandomCodeUtils.getRandomNumber(3));
	}
	
}
