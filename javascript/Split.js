

function booleanFeature() {
    var result = evaluate("Feature-1");
    if (result) {
        someDummyFunction();
        console.log("ON condition");
        onFunctionCall();
    } else if (!result) {
        console.log("OFF condition");
        offFunctionCall();
    }
}

function evaluate(flagName) {
    return true;
}


function onFunctionCall() {
    console.log("OnFunctionCall");
}

function offFunctionCall() {
    console.log("OffFunctionCall");
}

function someDummyFunction() {

}