package org.codes.codingplatforms.gfg.Month8;

public class NArrayRotation {
    public static void main(String[] args) {
        NArrayRotation.rotateNTimes(new int[]{1,2,3,4,5,6,7},3);
    }
    static int[] rotateNTimes(int arr[],int n)
    {
        int length = arr.length;

        // Calculate effective number of rotations
        int effectiveRotations = n % length;

        // Create a new array for rotated elements
        int[] rotatedArr = new int[length];

        for (int i = 0; i < length; i++) {
            // Calculate new index after rotation
            int newIndex = (i + effectiveRotations) % length;

            // Copy the element to the rotated array
            rotatedArr[newIndex] = arr[i];
        }
        return arr;
    }
}
