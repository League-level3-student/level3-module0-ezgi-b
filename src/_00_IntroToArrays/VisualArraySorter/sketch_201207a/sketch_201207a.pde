//1. create an array of ints. don't initialize it yet.
  int[] nums;

void setup() {
  //2. set the size of your window
  size(300,300);

  //3. initialize your array with the built in width variable
  nums = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built-in height variable, (int)random(height)
  randomFillArray(nums);

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(100, 240, 170);

  //7. set the color for your graph using the fill() method
  fill(20, 130, 230);
  for(int i = 0; i<nums.length; i++){
    fill(abs(150-i), 0, i);
    rect(i, height, 1, -nums[i]);
  }
  stepSort(nums);
  
  if(mousePressed){
    randomFillArray(nums);
  }

  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is the negative array value at the array index, e.g. -intArray[ i ]


  //9. call the stepSort method
  

  //10. extract the code from step 4 that randomizes the array into a new method.
  

  //11. call the method you made in step 10 when the mouse is pressed using the mousePressed variable
  
}

void randomFillArray(int[] arr){
  for(int i = 0; i<arr.length; i++){
    arr[i] = (int)random(height);
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
