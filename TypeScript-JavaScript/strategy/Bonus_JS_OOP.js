// 传统面向对象实现奖金
var performanceS = function(){};
performanceS.prototype.calculate = function( salary ){
    return salary * 4;
};
var performanceA = function(){};
performanceA.prototype.calculate = function( salary ){
    return salary * 3;
};
var performanceB = function(){};
performanceB.prototype.calculate = function( salary ){
    return salary * 2;
};


var Bonus = function(){
    this.salary = null; // 原始工资
    this.strategy = null; // 绩效等级对应的策略对象
};

Bonus.prototype.setSalary = function( salary ){
    this.salary = salary; // 设置员工的原始工资
};
Bonus.prototype.setStrategy = function( strategy ){
    this.strategy = strategy; // 设置员工绩效等级对应的策略对象
};
Bonus.prototype.getBonus = function(){ // 取得奖金数额
    return this.strategy.calculate( this.salary ); // 把计算奖金的操作委托给对应的策略对象
};

var Booding_bonus = new Bonus();
Booding_bonus.setSalary( 40000 );

Booding_bonus.setStrategy( new performanceS() ); // 设置策略对象
console.log( Booding_bonus.getBonus() ); // 输出：40000
Booding_bonus.setStrategy( new performanceA() ); // 设置策略对象
console.log( Booding_bonus.getBonus() ); // 输出：30000
