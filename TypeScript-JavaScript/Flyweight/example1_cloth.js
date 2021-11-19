// requirements
// male model for 50 kinds of cloth
// female model for 50 kinds of cloth
// function: take photos

var Model = function( sex ){ this.sex = sex; };
Model.prototype.takePhoto = function(){
    console.log( 'sex= ' + this.sex + ' cloth=' + this.cloth);
};
var maleModel = new Model( 'male' ), femaleModel = new Model( 'female' );
for ( var i = 1; i <= 50; i++ ){
    maleModel.cloth = 'cloth' + i; maleModel.takePhoto();
};
for ( var j = 1; j <= 50; j++ ){
    femaleModel.cloth = 'cloth' + j; femaleModel.takePhoto();
};

// this example still has some problems
// 1. we use construct function to new two models object, which is not always necessary in the beginning.
// 2. the outside state might be complicated. (this example set the out-state directly.)
// use factory pattern to solve 1
// use a manager to record the state

