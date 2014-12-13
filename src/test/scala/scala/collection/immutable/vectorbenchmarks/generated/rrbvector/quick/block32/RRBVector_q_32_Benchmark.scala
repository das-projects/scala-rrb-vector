package scala {
  package collection {
    package immutable {
      package vectorbenchmarks {
        package generated {
          package rrbvector.quick.block32 {
            package balanced {
              import scala.collection.immutable.vectorbenchmarks.genericbenchmarks._

              import scala.collection.immutable.vectorutils.VectorGeneratorType

              import scala.collection.immutable.vectorutils.generated.rrbvector.quick.block32._

              import scala.collection.immutable.generated.rrbvector.quick.block32._

              trait RRBVector_q_32_Benchmark[A] extends BaseVectorBenchmark[A] with RRBVectorGenerator_q_32[A] {
                override def generateVectors(from: Int, to: Int, by: Int, sizesName: String): org.scalameter.Gen[RRBVector_q_32[A]] = sizes(from, to, by, sizesName).map(((size) => tabulatedVector(size)));
                def generateVectors2(from: Int, to: Int, by: Int): org.scalameter.Gen[scala.Tuple2[RRBVector_q_32[A], RRBVector_q_32[A]]] = sizes(from, to, by, "size1").flatMap(((size1) => sizes(from, to, by, "size2").map(((size2) => scala.Tuple2(tabulatedVector(size1), tabulatedVector(size2))))));
                override def vectorName: String = super.vectorName.+("Balanced")
              }

              abstract class RRBVector_q_32_Append_Benchmark[A] extends AppendBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_AppendInt_Benchmark extends RRBVector_q_32_Append_Benchmark[Int] with VectorGeneratorType.IntGenerator {
                def append(vec: RRBVector_q_32[Int], n: Int): Int = {
                  var v = vec;
                  var i = 0;
                  while (i.<(n)) 
                    {
                      v = vec.:+(0);
                      i.+=(1)
                    }
                  ;
                  v.length
                }
              }

              class RRBVector_q_32_AppendString_Benchmark extends RRBVector_q_32_Append_Benchmark[String] with VectorGeneratorType.StringGenerator {
                val ref = "";
                def append(vec: RRBVector_q_32[String], n: Int): Int = {
                  var v = vec;
                  var i = 0;
                  while (i.<(n)) 
                    {
                      v = vec.:+(ref);
                      i.+=(1)
                    }
                  ;
                  v.length
                }
              }

              abstract class RRBVector_q_32_Prepend_Benchmark[A] extends PrependBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_PrependInt_Benchmark extends RRBVector_q_32_Prepend_Benchmark[Int] with VectorGeneratorType.IntGenerator {
                def prepend(vec: RRBVector_q_32[Int], n: Int, times: Int): Int = {
                  var i = 0;
                  var sum = 0;
                  while (i.<(times)) 
                    {
                      var v = vec;
                      var j = 0;
                      while (j.<(n)) 
                        {
                          v = {
                            val x$61 = 0;
                            vec.+:(x$61)
                          };
                          j.+=(1)
                        }
                      ;
                      sum.+=(v.length);
                      i.+=(1)
                    }
                  ;
                  sum
                }
              }

              class RRBVector_q_32_PrependString_Benchmark extends RRBVector_q_32_Prepend_Benchmark[String] with VectorGeneratorType.StringGenerator {
                val ref = "";
                def prepend(vec: RRBVector_q_32[String], n: Int, times: Int): Int = {
                  var i = 0;
                  var sum = 0;
                  while (i.<(times)) 
                    {
                      var v = vec;
                      var j = 0;
                      while (j.<(n)) 
                        {
                          v = {
                            val x$62 = ref;
                            vec.+:(x$62)
                          };
                          j.+=(1)
                        }
                      ;
                      sum.+=(v.length);
                      i.+=(1)
                    }
                  ;
                  sum
                }
              }

              abstract class RRBVector_q_32_Apply_Benchmark[A] extends ApplyBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_ApplyInt_Benchmark extends RRBVector_q_32_Apply_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_ApplyString_Benchmark extends RRBVector_q_32_Apply_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Builder_Benchmark[A] extends BuilderBenchmarks[A] with RRBVector_q_32_Benchmark[A] {
                def buildVector(n: Int): Int = {
                  var i = 0;
                  var b = RRBVector_q_32.newBuilder[A];
                  val e = element(0);
                  while (i.<(n)) 
                    {
                      b.+=(e);
                      i.+=(1)
                    }
                  ;
                  b.result().length
                }
              }

              class RRBVector_q_32_BuilderInt_Benchmark extends RRBVector_q_32_Builder_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_BuilderString_Benchmark extends RRBVector_q_32_Builder_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Concatenation_Benchmark[A] extends ConcatenationBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_ConcatenationInt_Benchmark extends RRBVector_q_32_Concatenation_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_ConcatenationString_Benchmark extends RRBVector_q_32_Concatenation_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Iteration_Benchmark[A] extends IterationBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_IterationInt_Benchmark extends RRBVector_q_32_Iteration_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_IterationString_Benchmark extends RRBVector_q_32_Iteration_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_MemoryAllocation_Benchmark[A] extends MemoryAllocation[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_IntMemoryAllocation_Benchmark extends RRBVector_q_32_MemoryAllocation_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_StringMemoryAllocation_Benchmark extends RRBVector_q_32_MemoryAllocation_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Split_Benchmark[A] extends SplitBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_SplitInt_Benchmark extends RRBVector_q_32_Split_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_SplitString_Benchmark extends RRBVector_q_32_Split_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_ParMap_Benchmark[A] extends ParMapBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_IntParMap_Benchmark extends RRBVector_q_32_ParMap_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_StringParMap_Benchmark extends RRBVector_q_32_ParMap_Benchmark[String] with VectorGeneratorType.StringGenerator
            }

            package xunbalanced {
              import scala.collection.immutable.vectorbenchmarks.genericbenchmarks._

              import scala.collection.immutable.vectorutils.VectorGeneratorType

              import scala.collection.immutable.vectorutils.generated.rrbvector.quick.block32._

              import scala.collection.immutable.generated.rrbvector.quick.block32._

              trait RRBVector_q_32_Benchmark[A] extends BaseVectorBenchmark[A] with RRBVectorGenerator_q_32[A] {
                override def generateVectors(from: Int, to: Int, by: Int, sizesName: String): org.scalameter.Gen[RRBVector_q_32[A]] = sizes(from, to, by, sizesName).map(((size) => randomVectorOfSize(size)(defaultVectorConfig(111))));
                def generateVectors2(from: Int, to: Int, by: Int): org.scalameter.Gen[scala.Tuple2[RRBVector_q_32[A], RRBVector_q_32[A]]] = sizes(from, to, by, "size1").flatMap(((size1) => sizes(from, to, by, "size2").map(((size2) => scala.Tuple2(randomVectorOfSize(size1)(defaultVectorConfig(111)), randomVectorOfSize(size2)(defaultVectorConfig(111)))))));
                override def vectorName: String = super.vectorName.+("XUnbalanced")
              }

              abstract class RRBVector_q_32_Append_Benchmark[A] extends AppendBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_AppendInt_Benchmark extends RRBVector_q_32_Append_Benchmark[Int] with VectorGeneratorType.IntGenerator {
                def append(vec: RRBVector_q_32[Int], n: Int): Int = {
                  var v = vec;
                  var i = 0;
                  while (i.<(n)) 
                    {
                      v = vec.:+(0);
                      i.+=(1)
                    }
                  ;
                  v.length
                }
              }

              class RRBVector_q_32_AppendString_Benchmark extends RRBVector_q_32_Append_Benchmark[String] with VectorGeneratorType.StringGenerator {
                val ref = "";
                def append(vec: RRBVector_q_32[String], n: Int): Int = {
                  var v = vec;
                  var i = 0;
                  while (i.<(n)) 
                    {
                      v = vec.:+(ref);
                      i.+=(1)
                    }
                  ;
                  v.length
                }
              }

              abstract class RRBVector_q_32_Prepend_Benchmark[A] extends PrependBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_PrependInt_Benchmark extends RRBVector_q_32_Prepend_Benchmark[Int] with VectorGeneratorType.IntGenerator {
                def prepend(vec: RRBVector_q_32[Int], n: Int, times: Int): Int = {
                  var i = 0;
                  var sum = 0;
                  while (i.<(times)) 
                    {
                      var v = vec;
                      var j = 0;
                      while (j.<(n)) 
                        {
                          v = {
                            val x$63 = 0;
                            vec.+:(x$63)
                          };
                          j.+=(1)
                        }
                      ;
                      sum.+=(v.length);
                      i.+=(1)
                    }
                  ;
                  sum
                }
              }

              class RRBVector_q_32_PrependString_Benchmark extends RRBVector_q_32_Prepend_Benchmark[String] with VectorGeneratorType.StringGenerator {
                val ref = "";
                def prepend(vec: RRBVector_q_32[String], n: Int, times: Int): Int = {
                  var i = 0;
                  var sum = 0;
                  while (i.<(times)) 
                    {
                      var v = vec;
                      var j = 0;
                      while (j.<(n)) 
                        {
                          v = {
                            val x$64 = ref;
                            vec.+:(x$64)
                          };
                          j.+=(1)
                        }
                      ;
                      sum.+=(v.length);
                      i.+=(1)
                    }
                  ;
                  sum
                }
              }

              abstract class RRBVector_q_32_Apply_Benchmark[A] extends ApplyBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_ApplyInt_Benchmark extends RRBVector_q_32_Apply_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_ApplyString_Benchmark extends RRBVector_q_32_Apply_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Builder_Benchmark[A] extends BuilderBenchmarks[A] with RRBVector_q_32_Benchmark[A] {
                def buildVector(n: Int): Int = {
                  var i = 0;
                  var b = RRBVector_q_32.newBuilder[A];
                  val e = element(0);
                  while (i.<(n)) 
                    {
                      b.+=(e);
                      i.+=(1)
                    }
                  ;
                  b.result().length
                }
              }

              class RRBVector_q_32_BuilderInt_Benchmark extends RRBVector_q_32_Builder_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_BuilderString_Benchmark extends RRBVector_q_32_Builder_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Concatenation_Benchmark[A] extends ConcatenationBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_ConcatenationInt_Benchmark extends RRBVector_q_32_Concatenation_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_ConcatenationString_Benchmark extends RRBVector_q_32_Concatenation_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Iteration_Benchmark[A] extends IterationBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_IterationInt_Benchmark extends RRBVector_q_32_Iteration_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_IterationString_Benchmark extends RRBVector_q_32_Iteration_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_MemoryAllocation_Benchmark[A] extends MemoryAllocation[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_IntMemoryAllocation_Benchmark extends RRBVector_q_32_MemoryAllocation_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_StringMemoryAllocation_Benchmark extends RRBVector_q_32_MemoryAllocation_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_Split_Benchmark[A] extends SplitBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_SplitInt_Benchmark extends RRBVector_q_32_Split_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_SplitString_Benchmark extends RRBVector_q_32_Split_Benchmark[String] with VectorGeneratorType.StringGenerator

              abstract class RRBVector_q_32_ParMap_Benchmark[A] extends ParMapBenchmarks[A] with RRBVector_q_32_Benchmark[A]

              class RRBVector_q_32_IntParMap_Benchmark extends RRBVector_q_32_ParMap_Benchmark[Int] with VectorGeneratorType.IntGenerator

              class RRBVector_q_32_StringParMap_Benchmark extends RRBVector_q_32_ParMap_Benchmark[String] with VectorGeneratorType.StringGenerator
            }
          }
        }
      }
    }
  }
}