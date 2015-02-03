package scala.collection.immutable.vectorbenchmarks.fingertree

import scala.collection.immutable.vectorbenchmarks.genericbenchmarks.SplitBenchmarks
import scala.collection.immutable.vectorutils.VectorGeneratorType


abstract class FingerTreeAbstractSplitBenchmark[A] extends SplitBenchmarks[A] with FingerTreeBenchmark[A]

class FingerTreeSplitIntBenchmark extends FingerTreeAbstractSplitBenchmark[Int] with VectorGeneratorType.IntGenerator

class FingerTreeSplitStringBenchmark extends FingerTreeAbstractSplitBenchmark[String] with VectorGeneratorType.StringGenerator

