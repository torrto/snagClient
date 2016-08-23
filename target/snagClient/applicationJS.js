/**
 * Created by rhy704 on 8/22/16.
 */
function isNumberKey(evt){
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
    return true;


}

function validateAlpha(){
    var textInput = document.getElementById("name").value;
    textInput = textInput.replace(/[^A-Za-z]/g, "");
    document.getElementById("name").value = textInput;
}