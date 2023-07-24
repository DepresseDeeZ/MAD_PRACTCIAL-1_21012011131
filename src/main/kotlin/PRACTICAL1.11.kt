class Matrix(private val data: Array<Array<Int>>) {
    // Overload the + operator for matrix addition
    operator fun plus(other: Matrix): Matrix {
        require(data.size == other.data.size && data[0].size == other.data[0].size) {
            "Matrices must have the same dimensions for addition."
        }

        val result = Array(data.size) { i ->
            Array(data[0].size) { j ->
                data[i][j] + other.data[i][j]
            }
        }

        return Matrix(result)
    }

    // Overload the - operator for matrix subtraction
    operator fun minus(other: Matrix): Matrix {
        require(data.size == other.data.size && data[0].size == other.data[0].size) {
            "Matrices must have the same dimensions for subtraction."
        }

        val result = Array(data.size) { i ->
            Array(data[0].size) { j ->
                data[i][j] - other.data[i][j]
            }
        }

        return Matrix(result)
    }

    // Overload the * operator for matrix multiplication
    operator fun times(other: Matrix): Matrix {
        require(data[0].size == other.data.size) {
            "Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication."
        }

        val result = Array(data.size) { i ->
            Array(other.data[0].size) { j ->
                var sum = 0
                for (k in data[0].indices) {
                    sum += data[i][k] * other.data[k][j]
                }
                sum
            }
        }

        return Matrix(result)
    }

    override fun toString(): String {
        val builder = StringBuilder()
        for (row in data) {
            builder.append(row.joinToString(" "))
            builder.append("\n")
        }
        return builder.toString()
    }
}

fun main() {
    val matrix1 = Matrix(
        arrayOf(
            arrayOf(1, 2),
            arrayOf(3, 4)
        )
    )

    val matrix2 = Matrix(
        arrayOf(
            arrayOf(5, 6),
            arrayOf(7, 8)
        )
    )

    val matrixSum = matrix1 + matrix2
    val matrixDiff = matrix1 - matrix2
    val matrixProduct = matrix1 * matrix2

    println("Matrix 1:")
    println(matrix1)
    println("Matrix 2:")
    println(matrix2)
    println("Matrix Sum:")
    println(matrixSum)
    println("Matrix Difference:")
    println(matrixDiff)
    println("Matrix Product:")
    println(matrixProduct)
}
