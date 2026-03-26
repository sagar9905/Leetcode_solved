/**
 * @param {number} n
 * @return {Function} counter
 */
 let m= 0; 
var createCounter = function(n) {
    m=n-1;
    return function() {
        m =m+1;
     return m;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */