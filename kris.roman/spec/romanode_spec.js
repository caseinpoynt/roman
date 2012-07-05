var romanode = require ('../src/romanode');

describe('romanode', function() {

    it('should convert 1 into I', function() {
	    expect(romanode.convert(1)).toEqual('I');
    })

    it('should convert 2 into II', function() {
	    expect(romanode.convert(2)).toEqual('II');
    })

    it('should convert 4 into IV', function() {
	    expect(romanode.convert(4)).toEqual('IV');
    })

    it('should convert 6 into VI', function() {
	    expect(romanode.convert(6)).toEqual('VI');
    })

    it('should convert 8 into VIII', function() {
	    expect(romanode.convert(8)).toEqual('VIII');
    })

    it('should convert 14 into XIV', function() {
	    expect(romanode.convert(14)).toEqual('XIV');
    })

    it('should convert 1492 into MCDXCII', function() {
	    expect(romanode.convert(1492)).toEqual('MCDXCII');
    })

    it('should convert 1994 into MCMXCIV', function() {
	    expect(romanode.convert(1994)).toEqual('MCMXCIV');
    })

    it('should convert 4999 into MMMMCMXCIX', function() {
	    expect(romanode.convert(4999)).toEqual('MMMMCMXCIX');
    })

    it('should complain about zero', function() {
	    expect(romanode.convert(0)).toEqual('0<n<5000');
    })

    it('should complain about negative numbers', function() {
	    expect(romanode.convert(-1)).toEqual('0<n<5000');
    })

    it('should complain about large numbers', function() {
	    expect(romanode.convert(5000)).toEqual('0<n<5000');
    })

})
