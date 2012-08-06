if (!window.iamin) {
	window.iamin = new Object();
}

console.log(123);

iamin.util = new Object();

iamin.util.createRoom = function() {
	var canvasQuery = jQuery(".room-canvas");
	for ( var i = 0; i < canvasQuery.length; i++) {
		var canvas = canvasQuery[i];
		var c = canvas.getContext("2d");
		var x = canvas.width / 2;
		var y = canvas.height / 2;
		var radius = 50;
		var startAngle = 0;
		var endAngle = 2 * Math.PI;
		var counterClockwise = false;

		// c.clearRect(0, 0, 182, 182);

		c.shadowBlur = 0;

		// c.strokeStyle = "#1293c9";
		c.strokeStyle = "#898989";
		c.lineWidth = 2;

		// c.strokeStyle = "#898989", c.lineWidth = 1.2

		c.beginPath(), c.arc(x, y, radius, startAngle, endAngle,
				counterClockwise), c.stroke();

		m = c.createLinearGradient(0, 50, 0, 50);
		m.addColorStop(0, "#ededed");
		m.addColorStop(1, "#d7d7d7");
		c.strokeStyle = m;
		c.lineWidth = 20;
		c.beginPath(), c.arc(x, y, radius - 10, startAngle, endAngle,
				counterClockwise), c.stroke();

		c.fillStyle = "#1293c9";
		c.beginPath();
		c.arc(x, y, radius - 10, startAngle, endAngle, counterClockwise);
		c.fill();

		c.fillStyle = "#5e99cd";
		c.beginPath();
		c.arc(x, y, radius - 12, startAngle, endAngle, counterClockwise);
		c.fill();
	}
};