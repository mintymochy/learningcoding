var x = 8;
var y = "meow";
var z = true;
let text1 = "What a very ";
text1 += "nice day";
{
    var x2 = 3; // can be used outside of block 
    let y2 = "meow"; // cannot be used outside of block 
}
if (x2 = y2) {
    console.log("fart");
}
switch (new Date().getDay()) {
  case 4:
  case 5:
    text = "Soon it is Weekend";
    break;
  case 0:
  case 6:
    text = "It is Weekend";
    break;
  default:
    text = "Looking forward to the Weekend";
}
const numbers = [45, 4, 9, 16, 25];

let txt = "";
for (let x in numbers) {
  txt += numbers[x];
}