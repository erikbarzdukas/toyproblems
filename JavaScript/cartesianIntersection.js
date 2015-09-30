/**
 * Given two points on a cartesian plane, determine
 * if they intersect
 */

var checkIntersection = function(arrayOfPoints) {
 
  var firstPoint = arrayOfPoints.slice(0, 3);
  var secondPoint = arrayOfPoints.slice(3);

  // Quick check of endpoints
  if(firstPoint[0][0] === secondPoint[0][0] ||
     firstPoint[1][0] === secondPoint[1][0] ||
     firstPoint[0][1] === secondPoint[0][1] ||
     firstPoint[1][1] === secondPoint[1][1]
    ) {

    return true;
  }

  /**
   * If one endpoint is in the range of 
   * the other, ie 1,1 -> 3,3 and 4,2 -> 2,4
   * 2 < 3 < 4
   */

  if(firstPoint
}
