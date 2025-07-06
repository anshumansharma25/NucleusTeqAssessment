let str = "Hello"

// reversed = str.split("").reverse().join("")
// console.log(reversed)

let newStr = function reverseString(str){

    for (let i = str.length-1; i >= 0; i-- ) {
        newStr += str[i]
    }
}
console.log(newStr)