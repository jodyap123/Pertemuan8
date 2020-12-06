package com.example.belajarrecyclerview


class SumberData {
    companion object {
        fun buatSetData(): ArrayList<LisObjDosen> {
            val list = ArrayList<LisObjDosen>()
//list bisa didapatkan/copas di web pcr ya. https://pcr.ac.id/prodi/301/teknik-informatika/profil
            list.add(
                LisObjDosen(
                    "Ananda, S.Kom,M.T.",
                    "Digital Image Processing",                 "https://pcr.ac.id/assets/images/pegawai/AND20170207022257.jpg",                 "108501",
                    "Pengolahan Citra Digital, Algoritma dan Pemrograman",                 "327"
                )
            )

            list.add(
                LisObjDosen(
                    "Silvana Rasio Henim, S.ST, M.T.",
                    "Programming",                 "https://pcr.ac.id/assets/images/pegawai/SRH20190718105457.jpg",                 "068407",
                    "Database, Programming, dan Rekayasa Perangkat Lunak",                 "136"
                )
            )

            list.add(
                LisObjDosen(
                    "Agus Urip Ari Wibowo, S.T.,M.T.",
                    "IoT",                 "https://pcr.ac.id/assets/images/pegawai/AUA20190718114257.jpg",                 "007001",
                    "Sistem Operasi Lanjut",
                    "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Ardianto Wibowo, S.Kom.,M.T.",
                    "Data Engineering",                 "https://pcr.ac.id/assets/images/pegawai/ARW20190718113926.jpg",                 "078517",
                    "Administrasi Basis Data",
                    "318"
                )
            )

            list.add(
                LisObjDosen(
                    "Erwin Setyo Nugroho, S.T.,M.Eng",
                    "Computer Networking & Administration",                 "https://pcr.ac.id/assets/images/pegawai/ESN20190718113952.jpg",                 "027614",
                    "Jaringan Komputer Dasar",
                    "326"
                )
            )

            list.add(
                LisObjDosen(
                    " Ibnu Surya, S.T.,M.T.",
                    "Operating System",                 "https://pcr.ac.id/assets/images/pegawai/ISA20190718114016.jpg",                 "078303",
                    "Sistem Operasi Dasar dan Lanjut",
                    "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Kartina Diah Kusuma Wardhani, S.T.,M.T.",
                    "Artifical Intelligent",                 "https://pcr.ac.id/assets/images/pegawai/DYH20170214111439.jpg",                 "078310",
                    "Basis Data Lanjut",
                    "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Maksum Ro'is Adin Saf, S.Kom., M.Eng.",
                    "Web Semantik",                 "https://pcr.ac.id/assets/images/pegawai/MRA20190718114446.jpg",                 "158803",
                    "Bengkel Pengembangan Web, Bengkel Pemrograman Framework, dan Struktur Data",
                    "136"
                )
            )

            list.add(
                LisObjDosen(
                    "Meilany Dewi, S.T.,M.T.",
                    "Computer Animation",                 "https://pcr.ac.id/assets/images/pegawai/MEL20190718114526.jpg",                 "048009",
                    "Konsep Teknologi Informasi, Pemrograman Web 2, dan Komputer Animasi 2",                 "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Muhammad Arif Fadhly Ridha, S.Kom.,M.T.",
                    "Cloud Computing",                 "https://pcr.ac.id/assets/images/pegawai/MAF20190718114601.jpg",                 "138701",
                    "Sistem Operasi, Jaringan Komputer Dasar/ Lanjut, Administrasi dan Keamana Jaringan, Komputasi Awan, dan Jaringan Multimedia",                 "328"             )
            )

            list.add(
                LisObjDosen(
                    "Muhammad Ihsan Zul, S.Pd., M.Eng.",
                    "Machine Learning",                 "https://pcr.ac.id/assets/images/pegawai/MIZ20190718115103.jpg",                 "138703",
                    "Artificial Intelligence, Machine Learning dan Basis Data Dasar",                 "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Rahmat Suhatman, S.T.M.T.",
                    "Certified Ethical Hacking",                 "https://pcr.ac.id/assets/images/pegawai/RMT20190718113858.jpg",                 "048110",
                    "Sistem Operasi Dasar, Sistem Operasi Lanjut, Jaringan Komputer Dasar" +                         "Administrasi Jaringan Komputer, dan Administrasi dan Keamanan Jaringan",                 "328"
                )
            )

            list.add(
                LisObjDosen(
                    "Rika Perdana Sari, S.T.,M.Eng.",
                    "Management System Information",                 "https://pcr.ac.id/assets/images/pegawai/RPS20190718114751.jpg",                 "098202",
                    "Pemrograman Web, dan Rekayasa Perangkat Lunak",
                    "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Shumaya Resty Ramadhani, S.ST., M.Sc.",
                    "Mobile and Desktop Technology",                 "https://pcr.ac.id/assets/images/pegawai/SRR20190718114820.jpg",                 "159208",
                    "Mobile Application Development, Algoritma dan Pemrograman," +                         " Sistem Informasi Geografis, Bengkel Desktop Aplikasi dan Keamanan Data",                 "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Dr. Juni Nurma Sari, S.Kom.,M.MT.",
                    "Programming",                 "https://pcr.ac.id/assets/images/pegawai/JNS20190718115229.jpg",                 "017218",
                    "Mobile Application Development",
                    "327"
                )
            )

            list.add(
                LisObjDosen(
                    "Yuliska, S.T., M.Eng.",
                    "Natural Language   Processing",                 "https://pcr.ac.id/assets/images/pegawai/YLK20191106020236.jpg",                 "199105",
                    "Konsep Teknologi Informasi, Workshop Pemrograman Framework",                 "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Khairul Umam Syaliman, S.T., M.Kom.",
                    "Data Mining",                 "https://pcr.ac.id/assets/images/pegawai/KUS20191106020716.jpg",                 "199204",
                    "Algoritma dan Pemrograman, dan Basis Data Dasar",
                    "326"
                )
            )

            list.add(
                LisObjDosen(
                    "Jan Alif Kreshna, S.ST., M.Sc.",
                    "Artificial Intelligent",                 "https://pcr.ac.id/assets/images/pegawai/JAK20170214113137.jpg",                 "1559007",
                    "Struktur Data",
                    "326"
                )
            )
            return list
        }
    }
}