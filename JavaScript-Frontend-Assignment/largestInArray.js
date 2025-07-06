function findLargest(arr){   
    let max = arr[0];

    for (let i = 0; i < arr.length; i++) {
  if (max < arr[i]) {
    max = arr[i];
  }
    }
    return max;
}

let arr = [5, 4, 3, 7, 5, 10, 89, 1, -92];

console.log(arr);
const result = findLargest(arr);
console.log(result);
