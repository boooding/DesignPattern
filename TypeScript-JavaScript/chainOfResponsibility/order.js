// without design pattern
const ex1 = () => {
    var order = function( orderType, pay, stock ){
        if ( orderType === 1 ){ // 500 元定金购买模式
            if ( pay === true ){ // 已支付定金
                console.log( '500 元定金预购, 得到100 优惠券' );
            }else{ // 未支付定金，降级到普通购买模式
                if ( stock > 0 ){ // 用于普通购买的手机还有库存
                    console.log( '普通购买, 无优惠券' );

                }else{
                    console.log( '手机库存不足' );
                }
            }
        }
        else if ( orderType === 2 ){ // 200 元定金购买模式
            if ( pay === true ){
                console.log( '200 元定金预购, 得到50 优惠券' );
            }else{
                if ( stock > 0 ){
                    console.log( '普通购买, 无优惠券' );
                }else{
                    console.log( '手机库存不足' );
                }
            }
        }
        else if ( orderType === 3 ){
            if ( stock > 0 ){
                console.log( '普通购买, 无优惠券' );
            }else{
                console.log( '手机库存不足' );
            }
        }
    };
    order( 1 , true, 500); // 输出： 500 元定金预购, 得到100 优惠券
}


// with design pattern
const ex2 = () => {
    var order500 = function( orderType, pay, stock ){
        if ( orderType === 1 && pay === true ){
            console.log( '500 元定金预购, 得到100 优惠券' );
        }else{
            order200( orderType, pay, stock ); // 将请求传递给200 元订单
        }

    };
    // 200 元订单
    var order200 = function( orderType, pay, stock ){
        if ( orderType === 2 && pay === true ){
            console.log( '200 元定金预购, 得到50 优惠券' );
        }else{
            orderNormal( orderType, pay, stock ); // 将请求传递给普通订单
        }
    };
    // 普通购买订单
    var orderNormal = function( orderType, pay, stock ){
        if ( stock > 0 ){
            console.log( '普通购买, 无优惠券' );
        }else{
            console.log( '手机库存不足' );
        }
    };

    // 测试结果：
    order500( 1 , true, 500); // 输出：500 元定金预购, 得到100 优惠券
    order500( 1, false, 500 ); // 输出：普通购买, 无优惠券
    order500( 2, true, 500 ); // 输出：200 元定金预购, 得到500 优惠券
    order500( 3, false, 500 ); // 输出：普通购买, 无优惠券
    order500( 3, false, 0 ); // 输出：手机库存不足
}

const ex3 = () => {

}