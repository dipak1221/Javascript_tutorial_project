function hasNumber(myString) {
    return /\d/.test(myString);
}

function getFormData() {
    var data = "";
    var form = document.forms['my_form'];
    var name = form["student_name"].value;
    if (name.length > 20 || hasNumber(name)) {
        name = "invalid";
    }
    console.log(name);
    data = "Name: " + name + "<br>";
    var age = form["student_age"].value;
    let num = (/^\d+$/.test(age));
    if (!num) age = "invalid";
    // let num=;
    console.log(age);
    // console.log(num);
    data = data + "Age: " + age + "<br>";

    // var gender = form["gender"].value;
    // console.log(gender);
    // data = data + "Gender: " + gender + "<br>";

    var city = form["city"].value;
    if (city == "") city = "invalid";
    console.log(city);
    data = data + "City: " + city + "<br>";

    var hobbies = "";
    var painting = form["painting"].checked;
    var dancing = form["dancing"].checked;
    var sports = form["sports"].checked;

    var flag = 0;
    if (painting) {
        flag = 1;
        hobbies = hobbies + "painting#";
    }
    if (dancing) {
        flag = 1;

        hobbies = hobbies + "dancing#";
    }
    if (sports) {
        flag = 1;

        hobbies = hobbies + "sports#";
    }
    if (flag == 0) hobbies = "invalid";

    data = data + "Hobbies: " + hobbies + "<br>";






















    document.querySelector("#getData").innerHTML = data;
    return false;
}