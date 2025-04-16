import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		int minDex = 0;
		int maxDex = ray.length - 1;
		int midDex = 0;
		Arrays.sort(ray);

		while(minDex <= maxDex)
		{
			midDex = (minDex + maxDex) /2;
			if(ray[midDex] > item)
			{
				maxDex = midDex - 1;
			}
			else if(ray[midDex] < item)
			{
				minDex = midDex + 1;
			}
			else
			{
				return midDex;
			}
		}

		return - 1;
		
	}
}
