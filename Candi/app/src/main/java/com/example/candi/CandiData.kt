package com.example.candi

object CandiData {
    private val candinames = arrayOf(
        "Goa Jomlang",
        "Candi Crambanan",
        "Candi Borobudur",
        "Gunung_Merapi",
        "Arung Jeram Citra Elo",
        "Kebun Binatang Gembira Loka",
        "Malioboro",
        "Pantai Parangtritis",
        "Taman Tari",
        "Keraton Yogyakarta")

    private val candidetails = arrayOf(
        "Goa Jomblang adalah sebuah goa wisata yang berlokasi di Gunung Kidul, Yogyakarta. Goa Jomblang merupakan goa vertikal yang mempunyai sebuah hutan purba di dalamnya. Selain itu, apabila anda datang ke Goa Jomblang pada jam 10 sampai dengan jam 12 siang, anda akan dapat melihat cahaya menembus goa yang sering disebut sebagai cahaya surga. Keindahan dan keunikan Goa Jomblang membuatnya menjadi salah satu tempat wisata di Yogyakarta yang wajib dikunjungi.",
        "Candi Prambanan merupakan salah satu tempat wisata di Yogyakarta yang wajib dikunjungi karena Candi Prambanan merupakan kompleks candi Hindu yang terbesar di Indonesia. Selain itu, Candi Prambanan juga dihiasi relief yang diukir mengelilingi candi dan menceritakan kisah Ramayana dan Krishnayana. Candi Prambanan berlokasi sektiar 17 KM dari psuat kota Yogyakarta. Apabila anda tidak membawa kendaraan pribadi, untuk mencapai Candi Prambanan anda cukup menggunakan bus dan turun di halte Prambanan, sangat mudah mencapai Candi Prambanan.",
        "Borobudur adalah nama sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah. Lokasi candi adalah kurang lebih 100 km di sebelah barat daya Semarang dan 40 km di sebelah barat laut Yogyakarta. Candi ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra.",
        "Gunung Merapi merupakan salah satu gunung di sekitar Yogyakarta. Gunung Merapipakan gunung yang paling terkenal di Yogyakarta, dan merupakan salah satu lokasi favorit para pecinta alam yang hobi mendaki gunung dan menikmati keindahan matahari terbit di puncaknya. Harga tiket masuk kawasan wisata Gunung Merapi adalah 3,000 Rupiah per orang.",
        "Arung Jeram Citra Elo adalah salah satu arung jeram yang ada di Yogyakarta. Arung Jeram Citra Elo adalah arung jeram yang paling cocok untuk keluarga atau pemula karena arusnya yang tidak berbahaya bila dibandingkan dengan sungai lain di sekitar Yogyakarta. Selain itu Arung Jeram Citra Elo juga dapat dimainkan kapan saja, tidak seperti sungai lain di Yogyakarta yang kebanyakan hanya dapat diarungi pada saat musim hujan saja.",
        "Kebun Binatang Gembira Loka adalah sebuah tempat wisata keluarga di Yogyakarta yang mempunyai banyak koleksi hewan dari berbagai tempat di dunia. Selain dapat melihat dan berinteraksi dengan berbagai jenis hewan seperti selayaknya kebun binatang pada umumnya, anda juga dapat bermain di beberapa wahana permainan yang terdapat di Kebun Binatang Gembira Loka. Wahana permainan yang ada di Kebun Binatang Gembira Loka yaitu kolam tangkap ikan, sepeda air, ATV, perahukayuh, menunggang gajah, menunggang onta, dan lain-lain. Harga tiket masuk Kebun Binatang Gembira Loka adalah 25,000 Rupiah per orang.",
        "Malioboro merupakan nama sebuah jalan di Yogyakarta. Jalan Malioboro ini sangatlah terkenal dan sudah menjadi salah satu tempat wisata di Yogyakarta yang wajib dikunjungi, bahkan untuk berfoto di penanda Jalan Malioboro saja kita sering kali harus mengantri terlebih dahulu. Nama Jalan Malioboro ini berasal dari bahasa Sansekerta dan mempunyai arti karangan bunga. Apa yang membuat Jalan Malioboro begitu terkenal?\n" +
                "\n" +
                "Jalan Malioboro menawarkan pengalaman wisata belanja dan wisata kuliner yang tak ada habisnya. Pada siang hari, di sepanjang Jalan Malioboro anda akan menemukan banyak sekali penjual pakaian, tas, sandal, gantungan kunci, kerajinan tangan, batik, aksesoris, dan barang-barang unik lainnya yang dapat dibeli dengan harga murah. Sedangkan pada malam hari, anda akan menemukan banyak sekali penjual makanan lesehan khas Yogyakarta di sepanjang Jalan Malioboro.",
        "Pantai Parangtritis adalah pantai yang paling terkenal di Yogyakarta, sehingga Pantai Parangtritis layak disebut sebagai salah satu tempat wisata di Yogyakarta yang wajib dikunjungi. Berlokasi sekitar 25 KM di selatan pusat kota Yogyakarta, Pantai Parangtritis adalah pantai yang berada di tepi Samudra Hindia sehingga mempunyai karakteristik ombak dan arus yang cukup besar dan kuat. Keunikan dari Pantai Parangtritis adalah adanya bukit pasir yang disebut gumuk di sekitar pantai. Apabila anda ingin suatu pengalaman yang berbeda, anda dapat mencoba bermain paralayang di Bukit Parangndog, Pantai Parangtritis.",
        "Istana Air Taman Sari adalah sebuah tempat rekreasi dan meditasi bagi keluarga kerajaan Yogyakarta pada jaman dahulu. Selain itu, Istana Air Taman Sari juga berfungsi sebagai benteng pertahanan terhadap musuh yang menyerang. Saat ini, Istana Air Taman Sari adalah salah satu tempat wisata di Yogyakarta yang terkenal karena keunikannya. Udara di sekitar Istana Air Taman Sari juga sejuk karena terdapat banyak kolam buatan disertai dengan kebun bunga yang berbau harum. Harga tiket masuk Istana Air Taman Sari adalah 5,000 Rupiah.",
        "Keraton Yogyakarta adalah salah satu tempat wisata di Yogyakarta yang ramai dikunjungi. Keraton Yogyakarta merupakan sebuah bangunan bersejarah kesultanan Yogyakarta yang ditinggali oleh Sultan dan keluarganya. Selain dapat menikmati arsitektur kesultanan kuno, anda juga dapat berkunjung ke museum yang mempunyai koleksi barang-barang kesultanan Yogyakarta yang sebagian merupakan hadiah dari raja Eropa. Apabila anda ingin datang mengunjungi tempat wisata ini, datanglah agak pagi karena Keraton Yogyakarta buka dari jam 8 pagi sampai dengan jam 2 siang saja."
    )

    private val candiimg = intArrayOf(
        R.drawable.goa_jomlang,
        R.drawable.candi_prambanan,
        R.drawable.candi_borobudur,
        R.drawable.gunung_merapi,
        R.drawable.citra_elo,
        R.drawable.gembira_loka,
        R.drawable.jalan_malioboro,
        R.drawable.pantai_parangtritis,
        R.drawable.taman_sari,
        R.drawable.keraton_yogyakarta
    )

    val listData: ArrayList<Candi> get() {
        val list = arrayListOf<Candi>()
        for (position in candinames.indices){
            val candi = Candi()
            candi.name = candinames[position]
            candi.detail = candidetails[position]
            candi.photo = candiimg[position]
            list.add(candi)
        }
        return list
    }
}