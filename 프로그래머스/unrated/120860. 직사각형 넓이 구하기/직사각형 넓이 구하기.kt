class Solution {
    fun solution(dots: Array<IntArray>): Int {
    var answer: Int = 0
    var widthMax = dots[0][0]
    var widthMin = dots[0][0]
    var heightMax = dots[0][1]
    var heightMin = dots[0][1]

    dots.forEach {
        val width = it[0]
        val height = it[1]

        if (width > widthMax) {
            widthMax = width
        } else if (width < widthMin) {
            widthMin = width
        }

        if (height > heightMax) {
            heightMax = height
        } else if (height < heightMin) {
            heightMin = height
        }
    }

    return (widthMax - widthMin + if(widthMax == widthMin) 1 else 0) * (heightMax - heightMin + if(heightMax == heightMin) 1 else 0)
}
}