// Java program to find if there is path
// from top left to right bottom
import java.io.*;
import java.util.*;

class pair
{
	int Item1, Item2;
	pair(int f, int s)
	{
		Item1 = f;
		Item2 = s;
	}
}

class GFG{
	
static int row = 5;
static int col = 5;

// To find the path from
// top left to bottom right
static boolean isPath(int[][] arr)
{
	
	// Directions
	int[][] dir = { { 0, 1 }, { 0, -1 },
					{ 1, 0 }, { -1, 0 } };
		
	// Queue
	Queue<pair> q = new LinkedList<>();
	
	// Insert the top right corner.
	q.add(new pair(0, 0));
		
	// Until queue is empty
	while (q.size() > 0)
	{
		pair p = (q.peek());
		q.remove();
			
		// Mark as visited
		arr[p.Item1][ p.Item2] = -1;
			
		// Destination is reached.
		if (p == new pair(row - 1, col - 1))
			return true;
				
		// Check all four directions
		for(int i = 0; i < 4; i++)
		{
			
			// Using the direction array
			int a = p.Item1 + dir[i][0];
			int b = p.Item2 + dir[i][1];
				
			// Not blocked and valid
			if (a >= 0 && b >= 0 &&
				a < row && b < col &&
				arr[a][ b] != -1)
			{
				q.add(new pair(a, b));
			}
		}
	}
	return false;
}

// Driver Code
public static void main(String[] args)
{
	
	// Given array
	int[][] arr = { { 0, 0, 0, -1, 0 },
					{ -1, 0, 0, -1, -1 },
					{ 0, 0, 0, -1, 0 },
					{ -1, 0, -1, 0, -1 },
					{ 0, 0, -1, 0, 0 } };

	// Path from arr[0][0] to arr[row][col]
	if (isPath(arr))
		System.out.println("Yes");
	else
		System.out.println("No");
}
}

// This code is contributed by avanitrachhadiya2155
