/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package histomaxrectarea;

import java.util.Stack;

/**
 *
 * @author yhuang
 */
public class HistoMaxRectArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] h1 = { 3, 4, 5, 3 };
        System.out.println("h1 max area: " + findMaxRectArea(h1));
        int[] h2 = { 3, 4, 5, 4, 10, 6, 10, 0 };
        System.out.println("h2 max area: " + findMaxRectArea(h2));
    }
    
    public static int findMaxRectArea(int[] histo) {
        //
        Stack<Integer>  hstack = new Stack<>();   // height stack
        Stack<Integer>  istack = new Stack<>();   // index stack
        int             maxArea = 0;
        for (int i = 0; i <= histo.length; i++) {
            int adjustedIndex = i;
            while (hstack.size() > 0) {
                if (i < histo.length && hstack.peek() <= histo[i]) {
                    break;
                }
                int area = hstack.peek() * (i - istack.peek());
                if (area > maxArea) maxArea = area;
                hstack.pop();
                adjustedIndex = istack.pop();
            }
            if (i < histo.length && (hstack.isEmpty() || hstack.peek() < histo[i])) {
                hstack.push(histo[i]);
                istack.push(adjustedIndex);
            }
        }
        return maxArea;
    }
}
