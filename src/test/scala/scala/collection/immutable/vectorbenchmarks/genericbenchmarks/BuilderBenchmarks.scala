
package scala.collection.immutable.vectorbenchmarks.genericbenchmarks

import org.scalameter.Key

import scala.collection.immutable.vectorbenchmarks.BaseVectorBenchmark

abstract class BuilderBenchmarks[A] extends BaseVectorBenchmark[A] {

    //    override def maxHeight: Int = 4

    def buildVector(n: Int): Int

    performanceOfVectors { height =>
        val (from, to, by) = fromToBy(height)

        var sideeffect = 0

        val warmups = if (height <= 2) 2000 else if (height == 3) 200 else 100
        measure method "builder" config(
          Key.exec.minWarmupRuns -> warmups,
          Key.exec.maxWarmupRuns -> warmups
          ) in {
            performance of s"build vectors of n elements" in {

                performance of s"Height $height" in {
                    using(sizes(from, to, by, "sizes")) setUp { size => System.gc()} curve vectorName in { n =>
                        sideeffect = buildVector(n)
                    }
                }
            }
        }
    }

}