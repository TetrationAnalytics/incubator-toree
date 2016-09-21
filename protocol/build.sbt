/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

//
// JSON DEPENDENCIES
//
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.3.10" excludeAll( // Apache v2
      ExclusionRule(organization = "com.fasterxml.jackson.core")
    ),
  "org.slf4j" % "slf4j-api" % "1.7.21" // MIT
)

//
// TEST DEPENDENCIES
//
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "2.2.6" % "test", // Apache v2
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.4", // Apache v2
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.10" % "2.7.4"
)

dependencyOverrides ++= Set(
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.4"
)