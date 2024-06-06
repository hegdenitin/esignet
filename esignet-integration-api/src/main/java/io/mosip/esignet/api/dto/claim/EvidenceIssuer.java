/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.esignet.api.dto.claim;

import lombok.Data;

@Data
public class EvidenceIssuer {

    private String name;
    private String country;
    private String country_code;
    private String jurisdiction;

}
