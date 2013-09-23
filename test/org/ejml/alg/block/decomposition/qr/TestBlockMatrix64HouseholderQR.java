/*
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.alg.block.decomposition.qr;

import org.junit.Test;

/**
 * @author Peter Abeles
 */
public class TestBlockMatrix64HouseholderQR {

    @Test
    public void generic() {
        BlockMatrix64HouseholderQR decomp = new BlockMatrix64HouseholderQR();

        GenericBlock64QrDecompositionTests tests;
        tests = new GenericBlock64QrDecompositionTests(decomp);

        tests.allTests();
    }

    @Test
    public void genericSaveW() {
        BlockMatrix64HouseholderQR decomp = new BlockMatrix64HouseholderQR();
        decomp.setSaveW(true);

        GenericBlock64QrDecompositionTests tests;
        tests = new GenericBlock64QrDecompositionTests(decomp);

        tests.allTests();
    }
}