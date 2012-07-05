module.exports = {
    convert: function(decimal) {

	if(decimal >= 5000 || decimal <= 0) return '0<n<5000';

	var map= { 1000: 'M', 900: 'CM', 500: 'D', 400: 'CD', 
		   100: 'C', 90: 'XC', 50: 'L', 40: 'XL', 
		   10: 'X', 9: 'IX',  5: 'V', 4: 'IV', 1: 'I' };

	var output = '';

	Object.keys(map).reverse().forEach(function(key) { 
		while (decimal >= key) {
		    output += map[key];
		    decimal -= key;
		}
	});
	return output;
    }
};
