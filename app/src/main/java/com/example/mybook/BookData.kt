package com.example.mybook

object BookData {
    private val titleBook = arrayOf(
        "Harry Potter and the Philosopher's Stone",
        "Harry Potter and the Prisoner of Azkaban",
        "Harry Potter and the Chamber of Secrets",
        "Harry Potter and the Goblet of Fire",
        "Harry Potter and the Order of the Phoenix",
        "Harry Potter and the Half-Blood Prince",
        "Harry Potter and the Deathly Hallows",
        "The Da Vinci Code",
        "Digital Fortress",
        "Origin"
    )

    private val descBook = arrayOf(
        "Harry Potter and the Philosopher's Stone is the first novel in the Harry Potter series by J.K. Rowling which will consist of seven books and featuring Harry Potter, a young wizard.",
        "Harry Potter and the Prisoner of Azkaban is the third book in the Harry Potter novel series by J. K. Rowling. This book was launched in March 2001 in Indonesia. This book was first launched in English on July 8, 1999 in the UK, while in the United States on September 8, 1999.",
        "Harry Potter and the Chamber of Secrets is the sequel to Harry Potter and the Philosopher's Stone. This book is the second book in the seventh Harry Potter novel series. In Indonesia, the book was released in November 2000, while the original version was in English on July 2, 1998 in the United Kingdom and June 2, 1999 in the United States.",
        "Harry Potter and the Goblet of Fire is the fourth book in J. K. Rowling's Harry Potter novel series. This book was launched in Indonesia in October 2001.",
        "Harry Potter and the Order of the Phoenix is the fifth book in the Harry Potter novel series by J. K. Rowling. This book was launched on January 11, 2004 for the Indonesian version following the English version which was launched on June 21, 2003.",
        "Harry Potter and the Half-Blood Prince, released on January 8, 2006 for the Indonesian version and July 16, 2005 in English-speaking countries under the title Harry Potter and the Half-Blood Prince, is the sixth book of seven planned novels about the popular work JK",
        "Harry Potter and the Deathly Hallows is the seventh and final book in the Harry Potter novel series by J. K. Rowling. This Indonesian translated version will be published in hardcover and softcover versions on January 13 and 26, 2008, respectively.",
        "The Da Vinci Code is a mystery detective novel by Dan Brown. This novel follows symbologist Robert Langdon and cryptologist Sophie Neveu after a murder at the Louvre Museum in Paris, when they become involved in a fight between the Priory of Sion and Opus Dei over the possibility that Jesus Christ married Mary Magdalene. The novel's title, among other things, refers to the finding of the first murder victim at the Louvre in a nude state and in a position like the Vitruvian Man, the famous image of Leonardo da Vinci, as well as a hidden message written beside his body and a pentagram drawn on his chest in his own blood.",
        "Digital Fortress is a book by American novelist Dan Brown published in 1998 by the publisher St. Martin's Press.",
        "Origin is a 2017 mystery thriller novel by American author Dan Brown and the fifth installment in the Robert Langdon series, after Angels & Demons, The Da Vinci Code, The Lost Symbol, and Inferno. The book was released in September 2017 by Doubleday."
    )

    private val authorBook = arrayOf(
        "J.K Rowling",
        "J.K Rowling",
        "J.K Rowling",
        "J.K Rowling",
        "J.K Rowling",
        "J.K Rowling",
        "J.K Rowling",
        "Dan Brown",
        "Dan Brown",
        "Dan Brown"

    )

    private val imageBook = intArrayOf(
        R.drawable.harry_potter_11,
        R.drawable.harry_potter_22,
        R.drawable.harry_potter_33,
        R.drawable.harry_potter_44,
        R.drawable.harry_potter_55,
        R.drawable.harry_potter_66,
        R.drawable.harry_potter_77,
        R.drawable.davinci,
        R.drawable.digital_fortress,
        R.drawable.origin
    )

    val listData: ArrayList<Book>
        get(){
            val list = arrayListOf<Book>()
            for (position in titleBook.indices){
                val book = Book()
                book.tittle = titleBook[position]
                book.desc = descBook[position]
                book.author = authorBook[position]
                book.img = imageBook[position]
                list.add(book)
            }
            return list
        }
}