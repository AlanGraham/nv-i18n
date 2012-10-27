/*
 * Copyright (C) 2012 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.i18n;


import java.util.Locale;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a>
 * language code.
 *
 * <p>
 * Enum names of this enum themselves are represented by
 * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code
 * (2-letter lower-case alphabets).
 * </p>
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
 * <span style="color: darkgreen;">// List all the language codes.</span>
 * for (LanguageCode code : LanguageCode.values())
 * {
 *     <span style="color: darkgreen;">// For example, "[ar] Arabic" is printed.</span>
 *     System.out.format("[%s] %s\n", code, code.{@link #getName()});
 * }
 *
 * <span style="color: darkgreen;">// Get a LanguageCode instance by ISO 639-1 code.</span>
 * LanguageCode code = LanguageCode.{@link #getByCode(String) getByCode}("fr");
 *
 * <span style="color: darkgreen;">// Convert to a Locale instance.</span>
 * Locale locale = code.{@link #toLocale()};
 *
 * <span style="color: darkgreen;">// Get a LanguageCode by a Locale instance.</span>
 * code = LanguageCode.{@link #getByLocale(Locale) getByLocale}(locale);
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum LanguageCode
{
    /**
     * <a href="http://en.wikipedia.org/wiki/Afar_language">Afar</a>
     */
    aa("Afar"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Abkhaz_language">Abkhaz</a>
     */
    ab("Abkhaz"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Avestan_language">Avestan</a>
     */
    ae("Avestan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Afrikaans_language">Afrikaans</a>
     */
    af("Afrikaans"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Akan_language">Akan</a>
     */
    ak("Akan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Amharic_language">Amharic</a>
     */
    am("Amharic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aragonese_language">Aragonese</a>
     */
    an("Aragonese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Arabic_language">Arabic</a>
     */
    ar("Arabic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Assamese_language">Assamese</a>
     */
    as("Assamese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Avar_language">Avaric</a>
     */
    av("Avaric"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Aymara_language">Aymara</a>
     */
    ay("Aymara"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Azerbaijani_language">Azerbaijani</a>
     */
    az("Azerbaijani"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bashkir_language">Bashkir</a>
     */
    ba("Bashkir"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Belarusian_language">Belarusian</a>
     */
    be("Belarusian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bulgarian_language">Bulgarian</a>
     */
    bg("Bulgarian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bihari_languages">Bihari</a>
     */
    bh("Bihari"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bislama_language">Bislama</a>
     */
    bi("Bislama"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bambara_language">Bambara</a>
     */
    bm("Bambara"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bengali_language">Bengali</a>
     */
    bn("Bengali"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Standard_Tibetan">Standard Tibetan</a>
     */
    bo("Standard Tibetan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Breton_language">Breton</a>
     */
    br("Breton"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bosnian_language">Bosnian</a>
     */
    bs("Bosnian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Catalan_language">Catalan</a>
     */
    ca("Catalan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chechen_language">Chechen</a>
     */
    ce("Chechen"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chamorro_language">Chamorro</a>
     */
    ch("Chamorro"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Corsican_language">Corsican</a>
     */
    co("Corsican"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cree_language">Cree</a>
     */
    cr("Cree"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Czech_language">Czech</a>
     */
    cs("Czech"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Old_Church_Slavonic">Old Church Slavonic</a>
     */
    cu("Old Church Slavonic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chuvash_language">Chuvash</a>
     */
    cv("Chuvash"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Welsh_language">Welsh</a>
     */
    cy("Welsh"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Danish_language">Danish</a>
     */
    da("Danish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/German_language">German</a>
     */
    de("German")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.GERMAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Dhivehi_language">Divehi</a>
     */
    dv("Divehi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dzongkha_language">Dzongkha</a>
     */
    dz("Dzongkha"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ewe_language">Ewe</a>
     */
    ee("Ewe"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Greek_language">Greek</a>
     */
    el("Greek"),

    /**
     * <a href="http://en.wikipedia.org/wiki/English_language">English</a>
     */
    en("English")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.ENGLISH;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Esperanto">Esperanto</a>
     */
    eo("Esperanto"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Spanish_language">Spanish</a>
     */
    es("Spanish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Estonian_language">Estonian</a>
     */
    et("Estonian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Basque_language">Basque</a>
     */
    eu("Basque"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Persian_language">Persian</a>
     */
    fa("Persian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fula_language">Fula</a>
     */
    ff("Fula"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Finnish_language">Finnish</a>
     */
    fi("Finnish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Fijian_language">Fijian</a>
     */
    fj("Fijian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Faroese_language">Faroese</a>
     */
    fo("Faroese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/French_language">French</a>
     */
    fr("French")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.FRENCH;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/West_Frisian_language">West Frisian</a>
     */
    fy("West Frisian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Irish_language">Irish</a>
     */
    ga("Irish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Scottish_Gaelic_language">Scottish Gaelic</a>
     */
    gd("Scottish Gaelic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Galician_language">Galician</a>
     */
    gl("Galician"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Guaran%C3%AD_language">Guaran&iacute;</a>
     */
    gn("Guaran\u00ED"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gujarati_language">Gujarati</a>
     */
    gu("Gujarati"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Manx_language">Manx</a>
     */
    gv("Manx"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hausa_language">Hausa</a>
     */
    ha("Hausa"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hebrew_language">Hebrew</a>
     */
    he("Hebrew"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hindi">Hindi</a>
     */
    hi("Hindi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hiri_Motu_language">Hiri Motu</a>
     */
    ho("Hiri Motu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Croatian_language">Croatian</a>
     */
    hr("Croatian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Haitian_Creole_language">Haitian</a>
     */
    ht("Haitian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Hungarian_language">Hungarian</a>
     */
    hu("Hungarian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Armenian_language">Armenian</a>
     */
    hy("Armenian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Herero_language">Herero</a>
     */
    hz("Herero"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingua">Interlingua</a>
     */
    ia("Interlingua"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Indonesian_language">Indonesian</a>
     */
    id("Indonesian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Interlingue_language">Interlingue</a>
     */
    ie("Interlingue"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Igbo_language">Igbo</a>
     */
    ig("Igbo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nuosu_language">Nuosu</a>
     */
    ii("Nuosu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Inupiaq_language">Inupiaq</a>
     */
    ik("Inupiaq"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ido">Ido</a>
     */
    io("Ido"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Icelandic_language">Icelandic</a>
     */
    is("Icelandic"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Italian_language">Italian</a>
     */
    it("Italian")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.ITALIAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Inuktitut">Inuktitut</a>
     */
    iu("Inuktitut"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Japanese_language">Japanese</a>
     */
    ja("Japanese")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.JAPANESE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Javanese_language">Javanese</a>
     */
    jv("Javanese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Georgian_language">Georgian</a>
     */
    ka("Georgian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kongo_language">Kongo</a>
     */
    kg("Kongo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Gikuyu_language">Kikuyu</a>
     */
    ki("Kikuyu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kwanyama">Kwanyama</a>
     */
    kj("Kwanyama"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kazakh_language">Kazakh</a>
     */
    kk("Kazakh"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kalaallisut_language">Kalaallisut</a>
     */
    kl("Kalaallisut"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Khmer_language">Khmer</a>
     */
    km("Khmer"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kannada_language">Kannada</a>
     */
    kn("Kannada"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Korean_language">Korean</a>
     */
    ko("Korean")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.KOREAN;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Kanuri_language">Kanuri</a>
     */
    kr("Kanuri"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kashmiri_language">Kashmiri</a>
     */
    ks("Kashmiri"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kurdish_language">Kurdish</a>
     */
    ku("Kurdish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Komi_language">Komi</a>
     */
    kv("Komi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Cornish_language">Cornish</a>
     */
    kw("Cornish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kyrgyz_language">Kyrgyz</a>
     */
    ky("Kyrgyz"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Latin">Latin</a>
     */
    la("Latin"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luxembourgish_language">Luxembourgish</a>
     */
    lb("Luxembourgish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Luganda">Ganda</a>
     */
    lg("Ganda"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Limburgish_language">Limburgish</a>
     */
    li("Limburgish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lingala_language">Lingala</a>
     */
    ln("Lingala"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lao_language">Lao</a>
     */
    lo("Lao"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Lithuanian_language">Lithuanian</a>
     */
    lt("Lithuanian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tshiluba_language">Luba-Katanga</a>
     */
    lu("Luba-Katanga"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Latvian_language">Latvian</a>
     */
    lv("Latvian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malagasy_language">Malagasy</a>
     */
    mg("Malagasy"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Marshallese_language">Marshallese</a>
     */
    mh("Marshallese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/M%C4%81ori_language">M&#257;ori</a>
     */
    mi("M\u0101ori"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Macedonian_language">Macedonian</a>
     */
    mk("Macedonian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malayalam_language">Malayalam</a>
     */
    ml("Malayalam"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Mongolian_language">Mongolian</a>
     */
    mn("Mongolian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Marathi_language">Marathi</a>
     */
    mr("Marathi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Malay_language">Malay</a>
     */
    ms("Malay"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Maltese_language">Maltese</a>
     */
    mt("Maltese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Burmese_language">Burmese</a>
     */
    my("Burmese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nauruan_language">Nauru</a>
     */
    na("Nauruan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Bokm%C3%A5l">Norwegian Bokm&aring;l</a>
     */
    nb("Norwegian Bokm\u00E5l"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Ndebele_language">Northern Ndebele</a>
     */
    nd("Northern Ndebele"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nepali_language">Nepali</a>
     */
    ne("Nepali"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ndonga">Ndonga</a>
     */
    ng("Ndonga"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Dutch_language">Dutch</a>
     */
    nl("Dutch"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Nynorsk">Norwegian Nynorsk</a>
     */
    nn("Norwegian Nynorsk"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Norwegian_language">Norwegian</a>
     */
    no("Norwegian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Southern_Ndebele_language">Southern Ndebele</a>
     */
    nr("Southern Ndebele"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Navajo_language">Navajo</a>
     */
    nv("Navajo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chichewa_language">Chichewa</a>
     */
    ny("Chichewa"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Occitan_language">Occitan</a>
     */
    oc("Occitan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ojibwe_language">Ojibwe</a>
     */
    oj("Ojibwe"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Oromo_language">Oromo</a>
     */
    om("Oromo"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Oriya_language">Oriya</a>
     */
    or("Oriya"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ossetic_language">Ossetian</a>
     */
    os("Ossetian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Punjabi_language">Punjabi</a>
     */
    pa("Punjabi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/P%C4%81li_language">P&#257;li</a>
     */
    pi("P\u0101li"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Polish_language">Polish</a>
     */
    pl("Polish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Pashto_language">Pashto</a>
     */
    ps("Pashto"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Portuguese_language">Portuguese</a>
     */
    pt("Portuguese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Quechua_language">Quechua</a>
     */
    qu("Quechua"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romansh_language">Romansh</a>
     */
    rm("Romansh"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kirundi">Kirundi</a>
     */
    rn("Kirundi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Romanian_language">Romanian</a>
     */
    ro("Romanian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Russian_language">Russian</a>
     */
    ru("Russian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Kinyarwanda">Kinyarwanda</a>
     */
    rw("Kinyarwanda"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sanskrit">Sanskrit</a>
     */
    sa("Sanskrit"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sardinian_language">Sardinian</a>
     */
    sc("Sardinian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sindhi_language">Sindhi</a>
     */
    sd("Sindhi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Northern_Sami">Northern Sami</a>
     */
    se("Northern Sami"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sango_language">Sango</a>
     */
    sg("Sango"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sinhala_language">Sinhala</a>
     */
    si("Sinhala"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovak_language">Slovak</a>
     */
    sk("Slovak"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Slovene_language">Slovene</a>
     */
    sl("Slovene"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Samoan_language">Samoan</a>
     */
    sm("Samoan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Shona_language">Shona</a>
     */
    sn("Shona"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Somali_language">Somali</a>
     */
    so("Somali"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Albanian_language">Albanian</a>
     */
    sq("Albanian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Serbian_language">Serbian</a>
     */
    sr("Serbian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swati_language">Swati</a>
     */
    ss("Swati"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sotho_language">Southern Sotho</a>
     */
    st("Southern Sotho"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Sundanese_language">Sundanese</a>
     */
    su("Sundanese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swedish_language">Swedish</a>
     */
    sv("Swedish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Swahili_language">Swahili</a>
     */
    sw("Swahili"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tamil_language">Tamil</a>
     */
    ta("Tamil"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Telugu_language">Telugu</a>
     */
    te("Telugu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tajik_language">Tajik</a>
     */
    tg("Tajik"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Thai_language">Thai</a>
     */
    th("Thai"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tigrinya_language">Tigrinya</a>
     */
    ti("Tigrinya"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkmen_language">Turkmen</a>
     */
    tk("Turkmen"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tagalog_language">Tagalog</a>
     */
    tl("Tagalog"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tswana_language">Tswana</a>
     */
    tn("Tswana"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tongan_language">Tongan</a>
     */
    to("Tongan"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Turkish_language">Turkish</a>
     */
    tr("Turkish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tsonga_language">Tsonga</a>
     */
    ts("Tsonga"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tatar_language">Tatar</a>
     */
    tt("Tatar"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Twi">Twi</a>
     */
    tw("Twi"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Tahitian_language">Tahitian</a>
     */
    ty("Tahitian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uyghur_language">Uighur</a>
     */
    ug("Uighur"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Ukrainian_language">Ukrainian</a>
     */
    uk("Ukrainian"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Urdu">Urdu</a>
     */
    ur("Urdu"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Uzbek_language">Uzbek</a>
     */
    uz("Uzbek"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Venda_language">Venda</a>
     */
    ve("Venda"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Vietnamese_language">Vietnamese</a>
     */
    vi("Vietnamese"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Volap%C3%BCk">Volap&uuml;k</a>
     */
    vo("Volap\u00FCk"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Walloon_language">Walloon</a>
     */
    wa("Walloon"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Wolof_language">Wolof</a>
     */
    wo("Wolof"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Xhosa_language">Xhosa</a>
     */
    xh("Xhosa"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yiddish_language">Yiddish</a>
     */
    yi("Yiddish"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Yoruba_language">Yoruba</a>
     */
    yo("Yoruba"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Zhuang_languages">Zhuang</a>
     */
    za("Zhuang"),

    /**
     * <a href="http://en.wikipedia.org/wiki/Chinese_language">Chinese</a>
     */
    zh("Chinese")
    {
        @Override
        public Locale toLocale()
        {
            return Locale.CHINESE;
        }
    },

    /**
     * <a href="http://en.wikipedia.org/wiki/Zulu_language">Zulu</a>
     */
    zu("Zulu")
    ;


    private final String name;


    private LanguageCode(String name)
    {
        this.name = name;
    }


    /**
     * Get the language name.
     *
     * @return
     *         The language name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Convert this LanguageCode instance to a {@link Locale} instance.
     *
     * <p>
     * In most cases, this method creates a new Locale instance
     * every time it is called, but some LanguageCode instances return
     * their corresponding entries in Locale class. For example,
     * {@link #ja LanguageCode.ja} always returns {@link Locale#JAPANESE}.
     * </p>
     *
     * <p>
     * The table below lists LanguageCode entries whose toLocale()
     * do not create new Locale instances but return entries in
     * Locale class.
     * </p>
     *
     * <table border="1" style="border-collapse: collapse;" cellpadding="5">
     * <tr bgcolor="#FF8C00">
     *   <th>LanguageCode</th>
     *   <th>Locale</th>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#de LanguageCode.de}</td>
     *   <td>{@link Locale#GERMAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#en LanguageCode.en}</td>
     *   <td>{@link Locale#ENGLISH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#fr LanguageCode.fr}</td>
     *   <td>{@link Locale#FRENCH}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#it LanguageCode.it}</td>
     *   <td>{@link Locale#ITALIAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ja LanguageCode.ja}</td>
     *   <td>{@link Locale#JAPANESE}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#ko LanguageCode.ko}</td>
     *   <td>{@link Locale#KOREAN}</td>
     * </tr>
     * <tr>
     *   <td>{@link LanguageCode#zh LanguageCode.zh}</td>
     *   <td>{@link Locale#CHINESE}</td>
     * </tr>
     * </table>
     *
     * @return
     *         A Locale instance that matches this LanguageCode.
     */
    public Locale toLocale()
    {
        return new Locale(name());
    }


    /**
     * Get a LanguageCode that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code.
     *
     * <p>
     * This method calls {@link #getByCode(String, boolean)
     * getByCode}(code, false), meaning the case of the given
     * code is ignored.
     * </p>
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code.
     *
     * @return
     *         A LanguageCode instance, or null if not found.
     */
    public static LanguageCode getByCode(String code)
    {
        return getByCode(code, false);
    }


    /**
     * Get a LanguageCode that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code.
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_639-1">ISO 639-1</a> code.
     *         Note that if the given code is one of legacy language codes
     *         ("iw", "ji" and "in"), it is treated as its official counterpart
     *         ("he", "yi" and "id", respectively). For example, if "in" is given,
     *         this method returns {@link #id LanguageCode.id}.
     *
     * @param caseSensitive
     *         If true, the given code should consist of lower-case letters only.
     *         If false, this method internally canonicalizes the given code by
     *         {@link String#toLowerCase()} and then performs search. For example,
     *         {@code getByCode("JA", true)} returns null, but on the other hand,
     *         {@code getByCode("JA", false)} returns {@link #ja LanguageCode.ja}.
     *
     * @return
     *         A LanguageCode instance, or null if not found.
     */
    public static LanguageCode getByCode(String code, boolean caseSensitive)
    {
        code = canonicalize(code, caseSensitive);

        if (code == null)
        {
            return null;
        }

        try
        {
            return Enum.valueOf(LanguageCode.class, code);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    /**
     * Get a LanguageCode that corresponds to the language code of
     * the given {@link Locale} instance.
     *
     * @param locale
     *         A Locale instance.
     *
     * @return
     *         A LanguageCode instance, or null if not found.
     *
     * @see Locale#getLanguage()
     */
    public static LanguageCode getByLocale(Locale locale)
    {
        if (locale == null)
        {
            return null;
        }

        // Locale.getLanguage() returns either an empty string or
        // a lowercase ISO 639 code.
        return getByCode(locale.getLanguage(), true);
    }


    /**
     * Canonicalize the given language code.
     *
     * <ol>
     * <li>If the given code is null or an empty string, null is returned.
     * <li>Otherwise, if the given code matches one of three legacy
     *     language code ("iw", "ji" and "in"), its official counterpart
     *     ("he", "yi" and "id", respectively) is returned. Note that
     *     String.equals(Object) is used for comparison if caseSensitive
     *     is true and that String.equalsIgnoreCase(String) is used if
     *     caseSensitive is false.
     * <li>Otherwise, if caseSensitive is true, the given code is returned
     *     as is.
     * <li>Otherwise, code.toLowercase() is returned.
     * </ol>
     *
     * @param code
     *         ISO 639-1 code.
     *
     * @param caseSensitive
     *         True if the code should be handled case-sensitively.
     *
     * @return
     *         Canonicalized language code.
     */
    static String canonicalize(String code, boolean caseSensitive)
    {
        if (code == null || code.length() == 0)
        {
            return null;
        }

        // Support legacy language codes. Map three obsolete language codes
        // { "iw", "ji", "in" } to new official ones { "he", "yi", "id" }.
        final String[] legacy = { "iw", "ji", "in" };
        final String[] official = { "he", "yi", "id" };

        for (int i = 0; i < legacy.length; ++i)
        {
            if (caseSensitive)
            {
                if (code.equals(legacy[i]))
                {
                    return official[i];
                }
            }
            else
            {
                if (code.equalsIgnoreCase(legacy[i]))
                {
                    return official[i];
                }
            }
        }

        if (caseSensitive)
        {
            return code;
        }
        else
        {
            return code.toLowerCase();
        }
    }
}
