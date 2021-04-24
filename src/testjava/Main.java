package testjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] x;
		x = new int[20];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;;i++) {
			if(Integer.parseInt(br.readLine())>0) {
				x[i] = Integer.parseInt(br.readLine());
			}
			else {
				x[i] = Integer.parseInt(br.readLine());
				break;
			}
			System.out.println(processArray(x));
		}
		

	}

	private static double processArray(int[] x) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=0;i<x.length;i++) {
			total += x[i];
		}
		double average =Math.ceil(total/(x.length));
		return average;
	}
}