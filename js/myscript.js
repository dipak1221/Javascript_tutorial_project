function focusFunction(element) {
    element.style.background = "green";
}

function blurFunction(element) {
    element.style.background = "";
}

document.querySelector("#name").addEventListener("input", function
    () {
    document.querySelector("#test").innerHTML = this.value;
});
function changeFunction(ele) {
    document.querySelector("#test").innerHTML = ele.value;
}
function selectFunction(ele){
    console.log("some text is selected");
}